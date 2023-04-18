package org.streamreasoning.gsp.data;

import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.Consumer;
import org.streamreasoning.rsp4j.api.stream.data.DataStream;

import java.util.ArrayList;
import java.util.List;

public class PGStream implements DataStream<PGraph> {

    protected String stream_uri;

    public PGStream(String stream_uri) {
        this.stream_uri = stream_uri;
    }

    protected List<Consumer<PGraph>> consumers = new ArrayList<>();

    @Override
    public void addConsumer(Consumer<PGraph> c) {
        consumers.add(c);
    }

    @Override
    public void put(PGraph e, long ts) {
        consumers.forEach(graphConsumer -> graphConsumer.notify(e, ts));
    }

    @Override
    public String getName() {
        return null;
    }



}
