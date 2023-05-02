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
    public void put(PGraph e, long ts)
    {
        consumers.forEach(graphConsumer -> graphConsumer.notify(e, ts));
    }

    //return stream_uri
    @Override
    public String getName() {
        return stream_uri;
    }

    //added hashCode and equals functions to compare two PGStreams and check if they contain the same values
    @Override
    public int hashCode(){
        if (stream_uri != null) return stream_uri.hashCode();
        return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PGStream other = (PGStream) obj;
        if (stream_uri != other.stream_uri)
            return false;
        return true;
    }



}
