package org.streamreasoning.gsp.engine.windowing;

import org.apache.commons.rdf.api.IRI;
import org.neo4j.graphdb.GraphDatabaseService;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.rsp4j.api.enums.ReportGrain;
import org.streamreasoning.rsp4j.api.enums.Tick;
import org.streamreasoning.rsp4j.api.operators.s2r.StreamToRelationOperatorFactory;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.StreamToRelationOp;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;
import org.streamreasoning.rsp4j.api.secret.report.Report;
import org.streamreasoning.rsp4j.api.secret.time.Time;
import org.streamreasoning.rsp4j.api.stream.data.WebDataStream;

import java.util.Map;

public class SeraphTimeWindowOperatorFactory implements StreamToRelationOperatorFactory<PGraph, PGraph> {

    private final long a, b;
    private final Time time;
    private final Tick tick;
    private final Report report;
    private final ReportGrain grain;
    private final GraphDatabaseService db;
    private ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>> context;

    public SeraphTimeWindowOperatorFactory(long a, long b, Time time, Tick tick, Report report, ReportGrain grain, ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>> context, GraphDatabaseService db) {
        this.a = a;
        this.b = b;
        this.time = time;
        this.tick = tick;
        this.report = report;
        this.grain = grain;
        this.context = context;
        this.db = db;
    }


    @Override
    public TimeVarying<PGraph> apply(WebDataStream<PGraph> s, IRI iri) {
        StreamToRelationOp<PGraph, PGraph> windowStreamToRelationOp = new SeraphStreamToRelationOp(iri, a, b, time, tick, report, grain, db);
        s.addConsumer(windowStreamToRelationOp);
        context.add(windowStreamToRelationOp);
        return windowStreamToRelationOp.get();
    }
}
