package org.streamreasoning.gsp.engine;

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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
        //TODO check if correct: changed getResultVars to
        resultVars = query.getAggregations();

    }

    //TODO change method override from eval(long) to eval(sds)
    @Override
    public Stream<SolutionMapping<Map<String,Object>>> eval(long ts) {
        //TODO fix up to stream
        String id = baseURI + "result;" + ts;
        this.tx = db.beginTx();

        //execute the cypher query
        Result result = tx.execute(query.getR2R().toString());
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


    @Override
    public Stream eval(SDS<PGraph> sds) {
        return new TimeVarying<Collection<Triple>>() {
            @Override
            public void materialize(long ts) {
                List<Triple> collect = eval(sds.toStream()).collect(Collectors.toList());
                solutions.clear();
                solutions.addAll(collect);
            }

            @Override
            public Collection<Triple> get() {
                return solutions;
            }

            @Override
            public String iri() {
                return null;
            }
        };
    }

    @Override
    public TimeVarying<Collection> apply(SDS sds) {
        return null;
    }

    @Override
    public SolutionMapping createSolutionMapping(Object result) {
        return null;
    }
}