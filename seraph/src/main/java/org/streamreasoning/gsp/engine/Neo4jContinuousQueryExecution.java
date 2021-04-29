package org.streamreasoning.gsp.engine;


import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.engine.windowing.SeraphStreamToRelationOp;
import org.streamreasoning.rsp4j.api.operators.r2r.RelationToRelationOperator;
import org.streamreasoning.rsp4j.api.operators.r2s.RelationToStreamOperator;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.StreamToRelationOp;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.querying.result.SolutionMapping;
import org.streamreasoning.rsp4j.api.sds.SDS;
import org.streamreasoning.rsp4j.api.stream.data.WebDataStream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by riccardo on 03/07/2017.
 */
public class Neo4jContinuousQueryExecution extends Observable implements Observer, ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>> {

    private final RelationToStreamOperator<Map<String, Object>> r2s;
    private final RelationToRelationOperator<Map<String, Object>> r2r;
    private final SDS sds;
    private final ContinuousQuery query;
    private final WebDataStream<Map<String, Object>> out;
    private final List<WebDataStream<PGraph>> instreams;
    private final ContinuousQuery q;
    private List<StreamToRelationOp<PGraph, PGraph>> s2rs;


    public Neo4jContinuousQueryExecution(WebDataStream<Map<String, Object>> out, List<WebDataStream<PGraph>> instreams, ContinuousQuery query, SDS sds, RelationToRelationOperator<Map<String, Object>> r2r, RelationToStreamOperator<Map<String, Object>> r2s, StreamToRelationOp<PGraph, PGraph>... s2rs) {
        this.query = query;
        this.q = query;
        this.sds = sds;
        this.s2rs = s2rs == null ? new ArrayList<>() : Arrays.asList(s2rs);
        this.r2r = r2r;
        this.r2s = r2s;
        this.out = out;
        this.instreams = instreams;
    }



    @Override
    public void update(Observable o, Object arg) {
        Long now = (Long) arg; // just marks the current time
        sds.materialize(now); // materializes the sds(data) a collection of timevarying variables
        Stream<SolutionMapping<Map<String, Object>>> eval1 = r2r.eval(now);
        /*
        Stream - returns a stream of elements, here it consists of SolutionMappings<PBinding> named eval1
        r2r    - is just a collection of PBindings( Map<String, Object> )
        eval   - does the action
         */

        eval1.forEach(ib -> { // For each Map<String, Object> it does something
            Map<String, Object> eval = r2s.eval(ib, now);
            setChanged(); // Indicates that the objects has now been changed
            if (outstream() != null) {
                outstream().put(eval, now);
            }
            notifyObservers(eval);
        });
    }
    /*
    private PBinding apply2(PBinding eval, Long now) {
        PBinding pgraph = new PGraph(); // creating a propertygraph to populate with Objects (Nodes)
        pgraph.setNodes((List<Node>) eval.values().stream());
        return pgraph;

    }
     */


    public ContinuousQuery getContinuousQuery() {
        return query;
    }

    public SDS<Map<String, Object>> getSDS() {
        return null;
    }

    public StreamToRelationOp<PGraph, Map<String, Object>>[] getS2R() {
        return new StreamToRelationOp[0];
    }


    public void addS2R(StreamToRelationOp<PGraph, PGraph> op) {
        s2rs.add(op);
    }

    public RelationToRelationOperator<Map<String, Object>> getR2R() {
        return r2r;
    }

    public RelationToStreamOperator<Map<String, Object>> getR2S() {
        return r2s;
    }


    @Override
    public WebDataStream<Map<String, Object>> outstream() {
        return out;
    }

    @Override
    public WebDataStream<PGraph>[] instream() {
        return  instreams.toArray(new WebDataStream[instreams.size()]);
    }

    @Override
    public ContinuousQuery query() {
        return q;
    }

    @Override
    public SDS<PGraph> sds() {
        return sds;
    }

    @Override
    public StreamToRelationOp<PGraph, PGraph>[] s2rs() {
        return new StreamToRelationOp[0];
    }

    @Override
    public RelationToRelationOperator<Map<String, Object>> r2r() {
        return r2r;
    }

    @Override
    public RelationToStreamOperator<Map<String, Object>> r2s() {
        return r2s;
    }

    @Override
    public void add(StreamToRelationOp<PGraph, PGraph> op) {
        op.link(this);
    }

    @Override
    public Stream<SolutionMapping<Map<String, Object>>> eval(Long now) {
        sds.materialize(now);
        return r2r.eval(now);
    }
}
