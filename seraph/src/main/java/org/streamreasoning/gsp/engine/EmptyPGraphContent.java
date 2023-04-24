package org.streamreasoning.gsp.engine;

import org.streamreasoning.rsp4j.api.secret.content.Content;

public class EmptyPGraphContent<I, O> implements Content<I, O> {

    long ts = System.currentTimeMillis();
    private O o;


    public EmptyPGraphContent(O o) {
        this.o = o;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(I e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getTimeStampLastUpdate() {
        return ts;
    }

    @Override
    public O coalesce() {
        return o;
    }
}