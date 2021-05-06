package org.streamreasoning.gsp.engine;

import org.neo4j.graphdb.*;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.data.PGraphImpl;
import org.streamreasoning.rsp4j.api.secret.content.Content;
import org.streamreasoning.rsp4j.api.secret.time.TimeFactory;

import java.util.*;

public class ContentPGraph implements Content<PGraph, PGraph> {
    private List<PGraph> elements;
    private long last_timestamp_changed;
    private String p = "Person";
    public RelationshipType friends = RelationshipType.withName("friends");
    protected GraphDatabaseService db;

    public ContentPGraph(GraphDatabaseService db) {
        this.db = db;
        this.elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public void add(PGraph e) {
        elements.add(e);
        this.last_timestamp_changed = TimeFactory.getInstance().getAppTime();
    }

    @Override
    public Long getTimeStampLastUpdate() {
        return last_timestamp_changed;
    }


    @Override
    public String toString() {
        return elements.toString();
    }

//
//    @Override
//    public org.streamreasoning.gsp.syntax.data.PGraph coalesce() {
//        if (elements.size() == 1)
//            return elements.get(0);
//        else {
//            Graph g = RDFUtils.createGraph();
//            elements.stream().flatMap(Graph::stream).forEach(g::add);
//            return g;
//        }
//    }

    @Override
    public PGraph coalesce() {
        Transaction txd = db.beginTx();
        txd.getAllNodes().forEach(node -> {
            node.getRelationships().forEach(Relationship::delete);
            node.delete();
        });
        txd.commit();
        //TODO First run query (delete n when n.prov == stream(name)) | added the execute delete query
        //TODO create a query that adds all the information into the elements
        Transaction tx = db.beginTx();
        for (PGraph g : elements) {
            Map<Long, Node> ids = new HashMap<>();
            Arrays.stream(g.nodes()).forEach(n1 -> {
                Node n = tx.createNode();
                Arrays.stream(n1.labels()).forEach(s -> n.addLabel(Label.label(s)));
                Arrays.stream(n1.properties()).forEach(p -> {
                    Object property = getProperty(n1, p);
                    n.setProperty(p, property);
                });
                ids.put(n1.id(), n);
            });
            //TODO Assumption on EDGES, they only refer to nodes in the current graph because we better use internal ids
            Arrays.stream(g.edges()).forEach(e -> {
                Node from = ids.computeIfAbsent(e.from(), l -> tx.createNode());
                Node to = ids.computeIfAbsent(e.to(), l -> tx.createNode());
                Arrays.stream(e.labels()).forEach(l -> {
                    Relationship r = from.createRelationshipTo(to, RelationshipType.withName(l));
                    Arrays.stream(e.properties()).forEach(p -> {
                        Object property = getProperty(e, p);
                        r.setProperty(p, property);
                    });
                });
            });
            ids.clear();
        }
        tx.commit();
        tx.close();

        //TODO ideally, we should return a org.streamreasoning.gsp.syntax.data.PGraph built out the new graphdb.
        return new PGraphDB(db);

    }

    private Object getProperty(PGraph.Node n1, String p) {
        Object property = n1.property(p);
        if (property instanceof Map) {
            return ((Map<?, ?>) property).entrySet().stream().findFirst().get().getValue();
        }
        return property;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContentPGraph that = (ContentPGraph) o;
        return last_timestamp_changed == that.last_timestamp_changed &&
                Objects.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements, last_timestamp_changed);
    }
}
