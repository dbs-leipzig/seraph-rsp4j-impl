package org.streamreasoning.gsp.engine;

import org.streamreasoning.gsp.data.PGraph;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.streamreasoning.rsp4j.api.operators.r2r.RelationToRelationOperator;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.result.SolutionMapping;
import org.streamreasoning.rsp4j.api.sds.SDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SeraphR2R implements RelationToRelationOperator<Map<String, Object>> {

    private final ContinuousQuery query;
    private final SDS<PGraph> sds;
    private final String baseURI;
    public final List<String> resultVars;

    private GraphDatabaseService db;

    private Transaction tx;

    public SeraphR2R(ContinuousQuery query, SDS<PGraph> sds, String baseURI, GraphDatabaseService db) {
        this.db = db;
        this.query = query;
        this.sds = sds;
        this.baseURI = baseURI;
        resultVars = query.getResultVars();

    }

    @Override
    public Stream<SolutionMapping<Map<String,Object>>> eval(long ts) {
        //TODO fix up to stream
        String id = baseURI + "result;" + ts;
        this.tx = db.beginTx();

        Result result = tx.execute(query.getR2R());
//        |--name-|--age--|-email--|
//        |--Fred--|--22--|--null--|
//        |--Riccardo--|--29--|--null--|

        List<Map<String, Object>> res = new ArrayList<>();
        while (result.hasNext()) {
            Map<String, Object> next = result.next();
            res.add(next);
//        |name-->Fred
//        |age-->22
        }

        tx.commit();
        tx.close();

        return res.stream().map(b -> new SolutionMappingImpl<>(id, b, this.resultVars, ts));
    }
}
