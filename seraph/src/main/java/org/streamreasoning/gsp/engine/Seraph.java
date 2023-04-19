package org.streamreasoning.gsp.engine;

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
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.Consumer;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.sds.SDS;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;
import org.streamreasoning.rsp4j.api.secret.report.Report;
import org.streamreasoning.rsp4j.api.secret.report.ReportImpl;
import org.streamreasoning.rsp4j.api.secret.report.strategies.OnWindowClose;
import org.streamreasoning.rsp4j.api.secret.time.Time;
import org.streamreasoning.rsp4j.api.stream.data.DataStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;


public class Seraph implements QueryRegistrationFeature<ContinuousQuery>, StreamRegistrationFeature<PGStream, PGStream> {

    private final long t0;
    private final String baseUri;
    private final String windowOperatorFactory;
    private final String S2RFactory = "yasper.window_operator_factory";
    private Report report;
    private Tick tick;
    protected EngineConfiguration rsp_config;
    protected Map<String, SDS> assignedSDS;
    protected Map<String, ContinuousQueryExecution> queryExecutions;
    protected Map<String, ContinuousQuery> registeredQueries;
    protected Map<String, List<QueryResultFormatter>> queryObservers;
    protected Map<String, DataStream<PGraph>> registeredStreams;
    private ReportGrain report_grain;

    //Create new neo4j graph database that will be used for the streaming data set
    TestDatabaseManagementServiceBuilder builder = new TestDatabaseManagementServiceBuilder();
    DatabaseManagementService dbm = builder.impermanent().build();
    GraphDatabaseService db = dbm.database(DEFAULT_DATABASE_NAME);

    public Seraph(EngineConfiguration rsp_config) {
        this.rsp_config = rsp_config;
        this.report = rsp_config.getReport();
        this.baseUri = rsp_config.getBaseIRI();
        this.report_grain = rsp_config.getReportGrain();
        this.tick = rsp_config.getTick();
        this.t0 = rsp_config.gett0();
        this.windowOperatorFactory = rsp_config.getString(S2RFactory);
        this.assignedSDS = new HashMap<>();
        this.registeredQueries = new HashMap<>();
        this.registeredStreams = new HashMap<>();
        this.queryObservers = new HashMap<>();
        this.queryExecutions = new HashMap<>();

    }


    @Override
    public  ContinuousQueryExecution<PGraph, PGraph, SeraphBinding, SeraphBinding> register(ContinuousQuery q){

        //ToDo check if sdsimpl needs to be changed -> probably not
        //create new streaming data set by using the neo4j database as sds
        SDS<PGraph> sds = new SeraphSDSImpl(db);

        //create output stream
        DataStream<SeraphBinding> out = new SeraphStreamImpl<SeraphBinding>(q.getID());

        ContinuousQueryExecution<PGraph, PGraph, SeraphBinding, SeraphBinding> cqe = new Neo4jContinuousQueryExecutionImpl<PGraph,PGraph,SeraphBinding,SeraphBinding>(sds, q, out, q.r2r(), q.r2s());




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
        registeredStreams.put(s.uri(), s);
        return s;
    }
}