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
import org.streamreasoning.rsp4j.api.secret.time.Time;
import org.streamreasoning.rsp4j.api.secret.time.TimeImpl;
import org.streamreasoning.rsp4j.api.stream.data.DataStream;
import org.stringtemplate.v4.ST;

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

    //create new engine and load config
    public Seraph(EngineConfiguration rsp_config) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.rsp_config = rsp_config;
        this.report = rsp_config.getReport();
        this.baseUri = rsp_config.getBaseIRI();
        this.report_grain = rsp_config.getReportGrain();
        this.tick = rsp_config.getTick();
        this.t0 = rsp_config.gett0();
        //ToDo Issue #8
        this.windowOperatorFactory = rsp_config.getString(S2RFactory);
        this.assignedSDS = new HashMap<>();
        this.registeredQueries = new HashMap<>();
        this.registeredStreams = new HashSet<>();
        this.queryObservers = new HashMap<>();
        this.queryExecutions = new HashMap<>();
        this.time = new TimeImpl(0);

        //create a new config factory
        cf = new PGraphContentFactory(db);
        //ToDo Issue #8
        Class<?> aClass = Class.forName("org.streamreasoning.gsp.engine.windowing.SeraphTimeWindowOperatorFactory");

        this.wf = (SeraphTimeWindowOperatorFactory<PGraph, PGraph>) aClass
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


    //register a query to the engine
    @Override
    public  ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>, Map<String, Object>> register(ContinuousQuery q) {


        //create new streaming data set by using the neo4j database as sds
        SDS<PGraph> sds = new SeraphSDSImpl(db);

        //create output stream
        DataStream<Map<String, Object>> out = new SeraphStreamImpl<Map<String, Object>>(q.getID()) {

            List<Consumer<Map<String, Object>>> consumers = new ArrayList<Consumer<Map<String, Object>>>();
            //ToDo check if uri can be changed to getOutputStream() of ContinuousQuery q
            String uri = "out"; // q.getOutputStream().uri();

            @Override
            public void addConsumer(Consumer<Map<String, Object>> c) {
                consumers.add(c);
            }

            @Override
            public void put(Map<String, Object> e, long ts) {
                consumers.forEach(mapConsumer -> {
                    mapConsumer.notify((Map<String, Object>) e, ts);
                });
            }

            @Override
            public String uri() {
                return uri;
            }
        };

        //register all the input streams declared in the query
        List<DataStream<PGraph>> in = new ArrayList<>();
        q.getInputStreams().forEach(s -> {
            PGStream register = this.register(new PGStream((String) s));
            in.add(register);
        });

        SeraphRStream r2s = new SeraphRStream();
        RelationToRelationOperator<PGraph, Map<String, Object>> r2r = new SeraphR2R(q, sds, q.getID(), db);

//        ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>, SeraphBinding> cqe = new Neo4jContinuousQueryExecutionImpl<PGraph,PGraph,Map<String, Object>,SeraphBinding>(sds, q, out, in, r2r,r2s);

        ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>, Map<String, Object>> cqe = new Neo4jContinuousQueryExecutionImpl<PGraph, PGraph, Map<String, Object>, Map<String, Object>>(sds, q, out, in, r2r, r2s);

        Map<? extends WindowNode, PGStream> windowMap = q.getWindowMap();

        windowMap.forEach((WindowNode wo, PGStream s) -> {

            //check if stream is registered
            //ToDo check wether if clause is redundant and build and wop can be moved into the filter for loop
            if (registeredStreams.contains(s)) {

                //TODO switch to parametric method WindowNode.params() for the simple ones
                //TODO for the BGP aware windows, we need to extract bgp from R2R and push them to the window, therefore we need a way to visualize the r2r tree
                StreamToRelationOp<PGraph, PGraph> build = wf.build(wo.getRange(), wo.getStep(), wo.getT0());
                StreamToRelationOp<PGraph, PGraph> wop = build.link(cqe, db);

                //check if s (stream out of the windowmap) equals to an input stream, if yes, apply a tvg and add it to a sds
                in.stream().filter(stream -> stream.getName().equals(s.getName())).forEach(stream -> {
                    TimeVarying<PGraph> tvg = wop.apply(stream);
                    if (wo.named()) {
                        if (wo.named()) {
                            sds.add(createIRI(wo.iri()), tvg);
                        } else {
                            sds.add(tvg);
                        }
                    }
                });
            }
        });

        return cqe;
    }

    //add property graph stream s to the registered streams
    @Override
    public PGStream register(PGStream s) {
        registeredStreams.add(s);
        return s;
    }


}


