package org.streamreasoning.gsp.engine;

import org.apache.commons.rdf.api.Graph;
import org.bouncycastle.asn1.dvcs.Data;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.streamreasoning.gsp.data.PGStream;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.engine.windowing.SeraphTimeWindowOperatorFactory;
import org.streamreasoning.rsp4j.api.RDFUtils;
import org.streamreasoning.rsp4j.api.engine.config.EngineConfiguration;
import org.streamreasoning.rsp4j.api.engine.features.QueryRegistrationFeature;
import org.streamreasoning.rsp4j.api.engine.features.StreamRegistrationFeature;
import org.streamreasoning.rsp4j.api.enums.ReportGrain;
import org.streamreasoning.rsp4j.api.enums.Tick;
import org.streamreasoning.rsp4j.api.format.QueryResultFormatter;
import org.streamreasoning.rsp4j.api.operators.r2r.RelationToRelationOperator;
import org.streamreasoning.rsp4j.api.operators.r2s.RelationToStreamOperator;
import org.streamreasoning.rsp4j.api.operators.s2r.StreamToRelationOperatorFactory;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.Consumer;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.StreamToRelationOp;
import org.streamreasoning.rsp4j.api.operators.s2r.syntax.WindowNode;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.sds.SDS;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;
import org.streamreasoning.rsp4j.api.secret.content.ContentFactory;
import org.streamreasoning.rsp4j.api.secret.report.Report;
import org.streamreasoning.rsp4j.api.secret.report.ReportImpl;
import org.streamreasoning.rsp4j.api.secret.report.strategies.OnWindowClose;
import org.streamreasoning.rsp4j.api.secret.time.Time;
import org.streamreasoning.rsp4j.api.secret.time.TimeImpl;
import org.streamreasoning.rsp4j.api.stream.data.DataStream;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.streamreasoning.rsp4j.api.RDFUtils.createIRI;


public class Seraph implements QueryRegistrationFeature<ContinuousQuery>, StreamRegistrationFeature<PGStream, PGStream> {

    private final long t0;
    private final String baseUri;
    private final String windowOperatorFactory;
    private final String S2RFactory = "yasper.window_operator_factory";

    private final Time time;

    private Report report;
    private Tick tick;
    protected EngineConfiguration rsp_config;
    protected Map<String, SDS> assignedSDS;
    protected Map<String, ContinuousQueryExecution> queryExecutions;
    protected Map<String, ContinuousQuery> registeredQueries;
    protected Map<String, List<QueryResultFormatter>> queryObservers;
    private ContentFactory cf;
    //changed registeredStreams from Map to Set
    //protected Map<String, DataStream<PGraph>> registeredStreams;
    protected Set<PGStream> registeredStreams;
    private ReportGrain report_grain;

    //Create new neo4j graph database that will be used for the streaming data set
    TestDatabaseManagementServiceBuilder builder = new TestDatabaseManagementServiceBuilder();
    DatabaseManagementService dbm = builder.impermanent().build();
    GraphDatabaseService db = dbm.database(DEFAULT_DATABASE_NAME);


    StreamToRelationOperatorFactory<PGraph, PGraph> wf;

    public Seraph(EngineConfiguration rsp_config) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.rsp_config = rsp_config;
        this.report = rsp_config.getReport();
        this.baseUri = rsp_config.getBaseIRI();
        this.report_grain = rsp_config.getReportGrain();
        this.tick = rsp_config.getTick();
        this.t0 = rsp_config.gett0();
        this.windowOperatorFactory = rsp_config.getString(S2RFactory);
        this.assignedSDS = new HashMap<>();
        this.registeredQueries = new HashMap<>();
        this.registeredStreams = new HashSet<>();
        this.queryObservers = new HashMap<>();
        this.queryExecutions = new HashMap<>();
        this.time = new TimeImpl(0);

        cf = new PGraphContentFactory(db);
        Class<?> aClass = Class.forName(rsp_config.getString(S2RFactory));

        this.wf = (StreamToRelationOperatorFactory<PGraph, PGraph>) aClass
                .getConstructor(
                        Time.class,
                        Tick.class,
                        Report.class,
                        ReportGrain.class,
                        ContentFactory.class)
                .newInstance(
                        time,
                        tick,
                        report,
                        report_grain,
                        cf);

    }


    @Override
    public  ContinuousQueryExecution<PGraph, PGraph, SeraphBinding, SeraphBinding> register(ContinuousQuery q){

        //ToDo check if SDSImpl needs to be changed -> probably not
        //create new streaming data set by using the neo4j database as sds
        SDS<PGraph> sds = new SeraphSDSImpl(db);

        //create output stream
        DataStream<SeraphBinding> out = new SeraphStreamImpl<SeraphBinding>(q.getID());





        //register all the input streams declared in the query
        List<DataStream<PGraph>> in = new ArrayList<>();
        q.getInputStreams().forEach(s -> {
            PGStream register = this.register(new PGStream((String) s));
            in.add(register);
        });

        ContinuousQueryExecution<PGraph, PGraph, SeraphBinding, SeraphBinding> cqe = new Neo4jContinuousQueryExecutionImpl<PGraph,PGraph,SeraphBinding,SeraphBinding>(sds, q, out, in, q.r2r(), q.r2s());

        Map<? extends WindowNode, PGStream> windowMap = q.getWindowMap();

        windowMap.forEach((WindowNode wo, DataStream s) -> {

            //ToDo Fix Set.contains function -> return false atm even though the registeredStreams Set contains a stream with the values of s
            if (registeredStreams.contains(s)) {



                //TODO switch to parametric method WindowNode.params() for the simple ones
                //TODO for the BGP aware windows, we need to extract bgp from R2R and push them to the window, therefore we need a way to visualize the r2r tree
                StreamToRelationOp<PGraph, PGraph> build = wf.build(wo.getRange(), wo.getStep(), wo.getT0());
                StreamToRelationOp<PGraph, PGraph> wop = build.link(cqe);
                TimeVarying<PGraph> tvg = wop.apply(s);
                if (wo.named()) {
                    if (wo.named()) {
                        sds.add(createIRI(wo.iri()), tvg);
                    } else {
                        sds.add(tvg);
                    }
                }
            }
        });


/*
        //STREAM DECLARATION
        //register all the input streams declared in the query
        List<DataStream<PGraph>> in = new ArrayList<>();
        q.getInputStreams().forEach(s -> {
            PGStream register = this.register(new PGStream(s));
            in.add(register);
        });

        //empty stream
        DataStream stream = q.getOutputStream();

        //create a new output stream
        DataStream<Map<String, Object>> out = new DataStream<Map<String, Object>>() {

            List<Consumer<Map<String, Object>>> consumers = new ArrayList<>();
            String uri = "out"; // q.getOutputStream().uri();

            @Override
            public void addConsumer(Consumer<Map<String, Object>> c) {
                consumers.add(c);
            }

            @Override
            public void put(Map<String, Object> e, long ts) {
                consumers.forEach(mapConsumer -> {
                    mapConsumer.notify(e, ts);
                });
            }

            @Override
            public String uri() {
                return uri;
            }
        };

        //use the neo4j database as a streaming data set
        SDS sds = new SeraphSDSImpl(db);

        //register the operator, which will execute the cypher query on each eval timestamp
        RelationToRelationOperator<Map<String, Object>> r2r = new SeraphR2R(q, sds, "", db);

        //create a new report which defines, when the contents of the stream will become visible for the query
        Report r = new ReportImpl();

        //define the strategy for the report: contents become visible for evaluation when the sliding window closes
        r.add(new OnWindowClose());

        Time time = q.getTime();

        RelationToStreamOperator<Map<String, Object>> r2s = new SeraphRStream();

        //changed from neo4jqexec to execImpl
        Neo4jContinuousQueryExecutionImpl cqe = new Neo4jContinuousQueryExecutionImpl(
                out,
                in,
                q,
                sds,
                new SeraphR2R(q, sds, q.getID(), db),
                r2s);


        q.getWindowMap().forEach((windowNode, webStream) -> {

            SeraphTimeWindowOperatorFactory wo = new SeraphTimeWindowOperatorFactory(windowNode.getRange(), windowNode.getStep(), time, Tick.TIME_DRIVEN, r, ReportGrain.SINGLE, cqe, db);

            in.stream().filter(s-> {

                return s.uri().equals(webStream.uri());

            }).forEach(s -> {

                TimeVarying<PGraph> t = wo.apply(s, RDFUtils.createIRI(s.uri()));

                //add time varying graph to the streaming data set (graph data base)
                sds.add(t);


            });
        });*/

        return cqe;
    }
    /*
    @Override
    public ContinuousQueryExecution<PGraph, PGraph, SeraphBinding, SeraphBinding> register(ContinuousQuery q) {
//        return new ContinuousQueryExecutionFactoryImpl(q, windowOperatorFactory, registeredStreams, report, report_grain, tick, t0).build();


        //STREAM DECLARATION
        //register all the input streams declared in the query
        List<DataStream<PGraph>> in = new ArrayList<>();
        q.getInputStreams().forEach(s -> {
            PGStream register = this.register(new PGStream(s));
            in.add(register);
        });

        //empty stream
        DataStream stream = q.getOutputStream();

        //create a new output stream
        DataStream<Map<String, Object>> out = new DataStream<Map<String, Object>>() {

            List<Consumer<Map<String, Object>>> consumers = new ArrayList<>();
            String uri = "out"; // q.getOutputStream().uri();

            @Override
            public void addConsumer(Consumer<Map<String, Object>> c) {
                consumers.add(c);
            }

            @Override
            public void put(Map<String, Object> e, long ts) {
                consumers.forEach(mapConsumer -> {
                    mapConsumer.notify(e, ts);
                });
            }

            @Override
            public String uri() {
                return uri;
            }
        };

        //use the neo4j database as a streaming data set
        SDS sds = new SeraphSDSImpl(db);

        //register the operator, which will execute the cypher query on each eval timestamp
        RelationToRelationOperator<Map<String, Object>> r2r = new SeraphR2R(q, sds, "", db);

        //create a new report which defines, when the contents of the stream will become visible for the query
        Report r = new ReportImpl();

        //define the strategy for the report: contents become visible for evaluation when the sliding window closes
        r.add(new OnWindowClose());

        Time time = q.getTime();

        RelationToStreamOperator<Map<String, Object>> r2s = new SeraphRStream();

        //changed from neo4jqexec to execImpl
        Neo4jContinuousQueryExecutionImpl cqe = new Neo4jContinuousQueryExecutionImpl(
                out,
                in,
                q,
                sds,
                new SeraphR2R(q, sds, q.getID(), db),
                r2s);


        q.getWindowMap().forEach((windowNode, webStream) -> {

            SeraphTimeWindowOperatorFactory wo = new SeraphTimeWindowOperatorFactory(windowNode.getRange(), windowNode.getStep(), time, Tick.TIME_DRIVEN, r, ReportGrain.SINGLE, cqe, db);

            in.stream().filter(s-> {

               return s.uri().equals(webStream.uri());

            }).forEach(s -> {

                TimeVarying<PGraph> t = wo.apply(s, RDFUtils.createIRI(s.uri()));

                //add time varying graph to the streaming data set (graph data base)
                sds.add(t);


            });
        });




//        q.getWindowMap().forEach((WindowNode wo, WebStream s) -> {
//            try {
//                StreamToRelationOperatorFactory<PGraph, PGraph> w;
//                IRI iri = RDFUtils.createIRI(wo.iri());
//
//                Class<?> aClass = Class.forName(windowOperatorFactory);
//                w = (StreamToRelationOperatorFactory<PGraph, PGraph>) aClass
//                        .getConstructor(long.class,
//                                long.class,
//                                long.class,
//                                Time.class,
//                                Tick.class,
//                                Report.class,
//                                ReportGrain.class,
//                                ContinuousQueryExecution.class)
//                        .newInstance(wo.getRange(),
//                                wo.getStep(),
//                                wo.getT0(),
//                                q.getTime(),
//                                tick,
//                                report,
//                                report_grain,
//                                cqe);

//            if (wo.getStep() == -1) {
//                w = new
//                (wo.getRange(), wo.getT0(), query.getTime(), tick, report, reportGrain, cqe);
//            } else
//                w = new CSPARQLTimeWindowOperatorFactory(wo.getRange(), wo.getStep(), wo.getT0(), query.getTime(), tick, report, reportGrain, cqe);
//
//                TimeVarying<PGraph> tvg = w.apply(registeredStreams.get(s.uri()), iri);
//
//                if (wo.named()) {
//                    sds.add(iri, tvg);
//                } else {
//                    sds.add(tvg);
//                }
//
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            } catch (NoSuchMethodException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        });
        return cqe;
    }
*/
    @Override
    public PGStream register(PGStream s) {
        registeredStreams.add(s);
        //old
        //registeredStreams.put(s.uri(), s);
        return s;
    }


}


