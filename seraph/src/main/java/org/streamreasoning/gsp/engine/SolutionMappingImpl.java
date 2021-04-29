package org.streamreasoning.gsp.engine;

import org.streamreasoning.rsp4j.api.querying.result.SolutionMapping;
import org.streamreasoning.rsp4j.api.querying.result.SolutionMappingBase;

import java.util.List;

public final class SolutionMappingImpl<T> extends SolutionMappingBase<T> {

    private final List<String> result_vars;

    public SolutionMappingImpl(String id, T results, List<String> resultVars, long cep_timestamp) {
        super(id, System.currentTimeMillis(), cep_timestamp, results);
        this.result_vars = resultVars;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolutionMappingBase<T> response = (SolutionMappingBase<T>) o;
        T binding = response.get();
        return this.get().equals(binding);
    }

    @Override
    public int hashCode() {
        return result_vars != null ? result_vars.hashCode() : 0;
    }

    @Override
    public SolutionMapping<T> difference(SolutionMapping<T> r) {
        //todo
        return null;
    }

    @Override
    public SolutionMapping<T> intersection(SolutionMapping<T> new_response) {
        //todo
        return null;
    }
}
