package org.streamreasoning.gsp.data;


import com.google.gson.Gson;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class PGraphImpl implements PGraph {

    private NodeImpl[] nodes;
    private EdgeImpl[] edges;

    protected long timestamp;

    private static Gson gson = new Gson();

    public PGraphImpl(NodeImpl[] nodes, EdgeImpl[] edges) {
        this.nodes = nodes;
        this.edges = edges;
        this.timestamp = System.currentTimeMillis();
    }

    public static PGraph createEmpty() {
        return new PGraphImpl(new NodeImpl[]{}, new EdgeImpl[]{});
    }

    //Create a property graph from a file and add the current system time as a timestamp
    public static PGraph fromJson(FileReader fileReader) {
        PGraphImpl pGraph = gson.fromJson(fileReader, PGraphImpl.class);
        pGraph.timestamp = System.currentTimeMillis();
        return pGraph;
    }

    @Override
    public PGraph.Node[] nodes() {
        return nodes;
    }

    @Override
    public PGraph.Edge[] edges() {
        return edges;
    }

    @Override
    public long timestamp() {
        return timestamp;
    }

    private class NodeImpl implements PGraph.Node {
        long id;
        String[] labels;
        Map<String, Object> properties;

        public NodeImpl(long id, String[] labels, Map<String, Object> properties) {
            this.id = id;
            this.labels = labels;
            this.properties = properties;
        }

        public NodeImpl() {
        }

        @Override
        public String toString() {
            return "(" + id +
                    ":" + Arrays.toString(labels) +
                    "{" + properties +
                    "})";
        }

        @Override
        public long id() {
            return id;
        }

        @Override
        public String[] labels() {
            return labels;
        }

        @Override
        public String[] properties() {
            return properties.keySet().toArray(new String[properties.size()]);
        }

        @Override
        public Object property(String p) {
            Object o = properties.get(p);
            return o instanceof ArrayList ? ((ArrayList<?>) o).get(0) : o;
        }
    }

    private class EdgeImpl extends NodeImpl implements PGraph.Edge {
        long from, to;

        public EdgeImpl(long id, String[] labels, Map<String, Object> properties, long from, long to) {
            super(id, labels, properties);
            this.from = from;
            this.to = to;
        }

        public EdgeImpl() {
        }


        @Override
        public String toString() {
            return "(" + from +
                    "," + to +
                    ")";
        }

        @Override
        public long to() {
            return to;
        }

        @Override
        public long from() {
            return from;
        }

        @Override
        public long id() {
            return from;
        }
    }
}
