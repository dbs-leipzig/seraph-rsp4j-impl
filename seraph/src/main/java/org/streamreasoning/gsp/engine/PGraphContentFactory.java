package org.streamreasoning.gsp.engine;

import org.apache.commons.rdf.api.Graph;
import org.neo4j.graphdb.GraphDatabaseService;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.data.PGraphImpl;
import org.streamreasoning.rsp4j.api.RDFUtils;
import org.streamreasoning.rsp4j.api.secret.content.Content;
import org.streamreasoning.rsp4j.api.secret.content.ContentFactory;
import org.streamreasoning.rsp4j.api.secret.time.Time;
import org.streamreasoning.rsp4j.yasper.content.ContentGraph;
import org.streamreasoning.rsp4j.yasper.content.EmptyContent;

public class PGraphContentFactory implements ContentFactory<PGraph, PGraph> {

    GraphDatabaseService db;

    public PGraphContentFactory(GraphDatabaseService db) {
        this.db = db;
    }


    @Override
    public Content<PGraph, PGraph> createEmpty() {
        return new EmptyPGraphContent<>(PGraphImpl.createEmpty());
    }

    @Override
    public Content<PGraph, PGraph> create() {
        return new ContentPGraph(db);
    }
}
