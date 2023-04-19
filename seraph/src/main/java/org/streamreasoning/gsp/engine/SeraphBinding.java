package org.streamreasoning.gsp.engine;

import org.apache.commons.rdf.api.RDFTerm;
import org.streamreasoning.rsp4j.api.operators.r2r.Var;

import java.util.Set;

import org.apache.commons.rdf.api.RDFTerm;
import org.streamreasoning.rsp4j.api.operators.r2r.Var;

import java.util.Set;

public interface SeraphBinding extends SeraphDifferentiable<SeraphBinding, SeraphBinding>, Cloneable {

    Set<Var> variables();

    RDFTerm value(Var v);

    RDFTerm value(String v);

    boolean compatible(SeraphBinding b);

    default SeraphBinding union(SeraphBinding b) {
        Set<Var> res = this.variables();
        SeraphBinding r = new SeraphBindingImpl(b.variables().size()+this.variables().size());
        res.forEach(v -> r.add(v, this.value(v)));
        b.variables().forEach(v -> r.add(v, b.value(v)));
        return r;
    }

    default SeraphBinding difference(SeraphBinding b) {
        SeraphBinding clone = (SeraphBinding) this.copy();
        Set<Var> res = clone.variables();
        res.removeAll(b.variables());
        SeraphBinding r = new SeraphBindingImpl();
        res.forEach(v -> r.add(v, clone.value(v)));
        return r;
    }

    default SeraphBinding intersection(SeraphBinding b) {
        SeraphBinding clone = (SeraphBinding) this.copy();
        Set<Var> res = clone.variables();
        res.retainAll(b.variables());
        SeraphBinding r = new SeraphBindingImpl();
        res.forEach(v -> r.add(v, clone.value(v)));
        return r;
    }

    default SeraphBinding copy() {
        SeraphBinding b = new SeraphBindingImpl();
        this.variables().forEach(v -> b.add(v, this.value(v)));
        return b;
    }

    boolean add(Var s, RDFTerm bind);

    int size();
}
