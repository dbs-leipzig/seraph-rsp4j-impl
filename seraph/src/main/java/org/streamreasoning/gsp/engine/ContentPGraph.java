package org.streamreasoning.gsp.engine;

import org.streamreasoning.gsp.data.PGraph;
import org.neo4j.graphdb.*;
import org.streamreasoning.rsp4j.api.secret.content.Content;
import org.streamreasoning.rsp4j.api.secret.time.TimeFactory;

import java.io.FileNotFoundException;
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

        txd.execute("MATCH (n) DETACH DELETE n");
        txd.commit();
        //TODO First run query (delete n when n.prov == stream(name)) | added the execute delete query
        //TODO create a query that adds all the information into the elements
        Transaction tx = db.beginTx();

        /*
            MERGE (p1:Person { name: event.initiated })
            MERGE (p2:Person { name: event.accepted })
            CREATE (p1)-[:FRIENDS { when: event.date }]->(p2)
        */
        elements.forEach(pGraph -> {
            try {

                //TODO add the name of the window operator.
                //one can see this as a
                pGraph.nodes().forEach(name -> {
                    Node n = tx.findNode(Label.label(p), "name", name);
                    if (n == null) {
                        n = tx.createNode(Label.label(p));
                        n.setProperty("name", name);
//                        node1.setProperty("__op", "win1");
                    }
                });
                pGraph.edges().forEach(edge -> {
                    Node firstNode = tx.findNode(Label.label(p), "name", edge[0]);
                    Node secondNode = tx.findNode(Label.label(p), "name", edge[1]);
                    firstNode.createRelationshipTo(secondNode, friends);
                });
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        //        elements.stream().flatMap(ig->GraphUtil.findAll(ig).toList().stream()).forEach(this.graph::add);

        tx.commit();
        tx.close();

        //TODO ideally, we should return a org.streamreasoning.gsp.syntax.data.PGraph built out the new graphdb.
        return new PGraph() {


            @Override
            public List<String> nodes() throws FileNotFoundException {
                Transaction tx = db.beginTx();
                List<String> emptyList = Collections.EMPTY_LIST;
                Result execute = tx.execute("MATCH (n) RETURN n");
                while (execute.hasNext()) {
                    emptyList.add(execute.next().toString());
                }
                tx.commit();
                tx.close();
                return emptyList;
            }

            @Override
            public List<String[]> edges() throws FileNotFoundException {
                Transaction tx = db.beginTx();
                List<String[]> emptyList = Collections.EMPTY_LIST;
                Result execute = tx.execute("MATCH (n)-[p]->(m) RETURN n,m,p");
                while (execute.hasNext()) {
                    Map<String, Object> next = execute.next();
                    emptyList.add(new String[]{
                            next.get("n").toString(),
                            next.get("m").toString(),
                            next.get("p").toString()});
                }
                tx.commit();
                tx.close();
                return emptyList;
            }

            @Override
            public long timestamp() {
                return System.currentTimeMillis();
            }
        };
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
