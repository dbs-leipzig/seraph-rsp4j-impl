package org.streamreasoning.gsp;

import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.rsp4j.api.secret.content.Content;

public class EmptyPGraphContent<T1, T2> implements Content<T1, T2> {

    long ts = System.currentTimeMillis();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(T1 e) {

    }
    @Override
    public Long getTimeStampLastUpdate() {
        return ts;
    }

    @Override
    public T2 coalesce() {
        return null;
    }
}
