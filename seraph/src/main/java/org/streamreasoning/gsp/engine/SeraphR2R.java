package org.streamreasoning.gsp.engine;

import org.apache.commons.rdf.api.Graph;
import org.apache.commons.rdf.api.Triple;
import org.streamreasoning.gsp.data.PGraph;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.streamreasoning.rsp4j.api.operators.r2r.RelationToRelationOperator;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.result.SolutionMapping;
import org.streamreasoning.rsp4j.api.sds.SDS;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;
import org.streamreasoning.rsp4j.yasper.querying.SelectInstResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.Instant.now;

public class SeraphR2R implements RelationToRelationOperator<PGraph, Map<String, Object>> {

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
        //TODO check if correct: changed getResultVars to
        resultVars = query.getResultVars();

    }


    //todo add timestamp
    @Override
    public Stream<Map<String, Object>> eval(Stream<PGraph> sds) {
        //ToDo remove println
        System.out.println("R2R eval TEST");

        //TODO fix up to stream


        Long ts = System.currentTimeMillis();
        String id = baseURI + "result;" + ts;
        this.tx = db.beginTx();

        //execute the cypher query
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

        return res.stream();



    }

    @Override
    public TimeVarying<Collection<Map<String, Object>>> apply(SDS<PGraph> sds) {
        //ToDo remove println
        System.out.println("R2R apply TEST");

        return null;
    }

    @Override
    public SolutionMapping<Map<String, Object>> createSolutionMapping(Map<String, Object> result) {

        return null;
        /*Long ts = System.currentTimeMillis();
        String id = baseURI + "result;" + ts;
        return new SolutionMappingImpl<>(id, );*/
    }

}
