package org.streamreasoning.gsp.engine;

import org.neo4j.graphdb.*;
import org.streamreasoning.gsp.data.PGraph;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class PGraphDB implements PGraph {

    private final GraphDatabaseService db;

    public PGraphDB(GraphDatabaseService db) {
        this.db = db;
    }

    @Override
    public Node[] nodes() {
        Transaction tx = db.beginTx();
        List<Node> emptyList = tx.getAllNodes().stream().map(DBNode::new).collect(Collectors.toList());
        tx.commit();
        tx.close();
        return emptyList.toArray(new PGraph.Node[emptyList.size()]);
    }

    @Override
    public Edge[] edges() {
        Transaction tx = db.beginTx();
        List<Edge> emptyList = tx.getAllNodes().stream()
                .map(n -> n.getRelationships(Direction.OUTGOING).spliterator())
                .flatMap(i -> StreamSupport.stream(i, false))
                .map(DBEdge::new).collect(Collectors.toList());
        return emptyList.toArray(new PGraph.Edge[emptyList.size()]);
    }

    private class DBEdge implements PGraph.Edge {

        Relationship r;
        private final String[] label;
        private final String[] keys;

        public DBEdge(Relationship r) {
            this.r = r;
            this.label = new String[]{r.getType().name()};
            keys = (String[]) StreamSupport.stream(r.getPropertyKeys().spliterator(), false).collect(Collectors.toList()).toArray();
        }

        @Override
        public long id() {
            return -1;
        }

        @Override
        public String[] labels() {
            return label;
        }

        @Override
        public String[] properties() {
            return keys;
        }

        @Override
        public Object property(String p) {
            return r.getProperty(p);
        }

        @Override
        public long to() {
            return r.getEndNodeId();
        }

        @Override
        public long from() {
            return r.getStartNodeId();
        }
    }

    private class DBNode implements PGraph.Node {

        private final String[] labels;
        private final String[] keys;
        private org.neo4j.graphdb.Node node;

        public DBNode(org.neo4j.graphdb.Node n) {
            this.node = n;
            Iterable<Label> labels = node.getLabels();
            List<String> collect = StreamSupport.stream(labels.spliterator(), false).map(Label::name).collect(Collectors.toList());
            this.labels = collect.toArray(new String[collect.size()]);
            this.keys = (String[]) StreamSupport.stream(node.getPropertyKeys().spliterator(), false).toArray();
        }

        @Override
        public long id() {
            return node.getId();
        }

        @Override
        public String[] labels() {
            return labels;
        }

        @Override
        public String[] properties() {
            return keys;
        }

        @Override
        public Object property(String p) {
            return node.getProperty(p);
        }
    }


}
//new PGraph() {
//
//
//@Override
//public Node[] nodes() {
//        Transaction tx = db.beginTx();
//        List<Node> emptyList = Collections.EMPTY_LIST;
//        Result execute = tx.execute("MATCH (n) RETURN n");
//        while (execute.hasNext()) {
//        emptyList.add(execute.next());
//        }
//        tx.commit();
//        tx.close();
//        return emptyList.toArray(new Node[emptyList.size()]);
//        }
//
//@Override
//public Edge[] edges() {
//        Transaction tx = db.beginTx();
//        List<String[]> emptyList = Collections.EMPTY_LIST;
//        Result execute = tx.execute("MATCH (n)-[p]->(m) RETURN n,m,p");
//        while (execute.hasNext()) {
//        Map<String, Object> next = execute.next();
//        emptyList.add(new String[]{
//        next.get("n").toString(),
//        next.get("m").toString(),
//        next.get("p").toString()});
//        }
//        tx.commit();
//        tx.close();
//        return emptyList;
//        }
//
//@Override
//public long timestamp() {
//        return System.currentTimeMillis();
//        }
//        };