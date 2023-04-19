package org.streamreasoning.gsp.engine;

public interface SeraphDifferentiable<R, O> {

    //TODO should implement the base case that r-r == 0;
    O difference(R r);
}

