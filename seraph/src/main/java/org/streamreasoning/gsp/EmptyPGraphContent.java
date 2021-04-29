package org.streamreasoning.gsp;

import org.apache.commons.rdf.api.Graph;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.rsp4j.api.secret.content.Content;

public class EmptyPGraphContent implements Content<PGraph, PGraph> {

    long ts = System.currentTimeMillis();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(PGraph e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getTimeStampLastUpdate() {
        return ts;
    }

    @Override
    public PGraph coalesce() {
        return null;
    }
}
