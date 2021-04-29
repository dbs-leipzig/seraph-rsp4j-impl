package org.streamreasoning.gsp.engine;

import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.StreamToRelationOp;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;
import org.apache.commons.rdf.api.IRI;

public class TimeVaryingPGraph implements TimeVarying<PGraph> {

    private final StreamToRelationOp<PGraph, PGraph> op;
    private IRI name;
    private PGraph graph;

    public TimeVaryingPGraph(StreamToRelationOp<PGraph, PGraph> op, IRI name, PGraph graph) {
        this.op = op;
        this.name = name;
        this.graph = graph;
    }

    /**
     * The setTimestamp function merges the element
     * in the content into a single graph
     * and adds it to the current dataset.
     **/
    @Override
    public void materialize(long ts) {
        graph = op.content(ts).coalesce();
    }

    @Override
    public PGraph get() {
        return graph;
    }

    @Override
    public String iri() {
        return name.getIRIString();
    }


}
