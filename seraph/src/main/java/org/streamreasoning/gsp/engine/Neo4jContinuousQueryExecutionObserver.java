package org.streamreasoning.gsp.engine;

import org.streamreasoning.rsp4j.api.operators.r2s.RelationToStreamOperator;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.sds.SDS;

import java.util.Observable;
import java.util.Observer;

public abstract class Neo4jContinuousQueryExecutionObserver<I, W, R, O> extends Observable implements Observer, ContinuousQueryExecution<I, W, R, O> {

    protected ContinuousQuery query;
    protected RelationToStreamOperator s2r;
    protected SDS sds;

    public Neo4jContinuousQueryExecutionObserver(SDS sds, ContinuousQuery query) {
        this.query = query;
        this.sds = sds;
    }

    public Neo4jContinuousQueryExecutionObserver(ContinuousQuery query, RelationToStreamOperator s2r, SDS sds) {
        this.query = query;
        this.s2r = s2r;
        this.sds = sds;
    }
}
