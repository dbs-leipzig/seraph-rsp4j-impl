package org.streamreasoning.gsp.engine.windowing;

import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.rsp4j.api.enums.ReportGrain;
import org.streamreasoning.rsp4j.api.enums.Tick;
import org.streamreasoning.rsp4j.api.operators.s2r.StreamToRelationOperatorFactory;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.StreamToRelationOp;
import org.streamreasoning.rsp4j.api.secret.content.ContentFactory;
import org.streamreasoning.rsp4j.api.secret.report.Report;
import org.streamreasoning.rsp4j.api.secret.time.Time;

public class SeraphTimeWindowOperatorFactory<P, P1> implements StreamToRelationOperatorFactory<PGraph, PGraph> {

    private final Time time;
    private final Tick tick;
    private final Report report;
    private final ReportGrain grain;
    //private final GraphDatabaseService db;
   // private ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>> context;
    private final ContentFactory<PGraph, PGraph> cf;

    //new constructor
    public SeraphTimeWindowOperatorFactory(Time time, Tick tick, Report report, ReportGrain grain, ContentFactory<PGraph, PGraph> cf) {

        this.time = time;
        this.tick = tick;
        this.report = report;
        this.grain = grain;
        this.cf = cf;
  }

    @Override
    public StreamToRelationOp<PGraph, PGraph> build(long a, long b, long t0) {
        return  new SeraphStreamToRelationOp<>(null, a,b, time, tick, report, grain, cf);

    }
}
