package org.streamreasoning.gsp.engine;

import org.streamreasoning.rsp4j.api.operators.r2s.RelationToStreamOperator;
import org.streamreasoning.rsp4j.api.querying.result.SolutionMapping;

/**
 * Created by riccardo on 05/09/2017.
 */
public class SeraphRStream<R, O> implements RelationToStreamOperator<R, O> {

    public static <R, O> RelationToStreamOperator<R, O> get() {
        return new SeraphRStream<R, O>();
    }

   /* @Override
    public T eval(SolutionMapping<T> last_response, long ts) {
        return last_response.get();
    }*/
    @Override
    public O transform(R last_response, long ts){
        return (O) last_response;
    }
}