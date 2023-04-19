package org.streamreasoning.gsp.engine;

import org.apache.commons.rdf.api.RDFTerm;
import org.streamreasoning.rsp4j.api.operators.r2r.Var;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SeraphBindingImpl implements SeraphBinding{
    Map<Var, RDFTerm> internal;

    public SeraphBindingImpl() {
        internal= new HashMap<>();
    }
    public SeraphBindingImpl(int size) {
        internal= new HashMap<>(size);
    }
    public SeraphBindingImpl(Map<Var, RDFTerm> possibleSeraphBinding) {
        this.internal = new HashMap<>(possibleSeraphBinding);
    }

    @Override
    public Set<Var> variables() {
        return internal.keySet();
    }

    @Override
    public RDFTerm value(Var v) {
        return internal.get(v);
    }

    @Override
    public RDFTerm value(String v) {
        return null;
    }

    @Override
    public boolean compatible(SeraphBinding b) {
        return this.variables().stream().anyMatch(var -> b.variables().contains(var));
    }

    @Override
    public boolean add(Var s, RDFTerm bind) {

        if (internal.containsKey(s)) {
            return bind.equals(internal.get(s));
        }

        return internal.put(s, bind) == null;
    }

    @Override
    public int size() {
        return internal.size();
    }

    @Override
    public String toString() {
        return internal.toString().replace("=", " -> ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeraphBindingImpl SeraphBinding = (SeraphBindingImpl) o;
        return Objects.equals(internal, SeraphBinding.internal);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return copy();
    }


    @Override
    public int hashCode() {
        return Objects.hash(internal);
    }

    public Map<Var, RDFTerm> getInternals() {
        return internal;
    }
}
