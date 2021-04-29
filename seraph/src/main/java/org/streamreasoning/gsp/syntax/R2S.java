package org.streamreasoning.gsp.syntax;

import java.time.Duration;

public class R2S {

    String op;
    Duration period;
    Integer periodE;

    public R2S(String op, Duration period, Integer periodE) {
        this.op = op;
        this.period = period;
        this.periodE = periodE;
    }

    @Override
    public String toString() {
        return "R2S(" +
                "" + op +
                "," + ((period != null) ? period : periodE) +

                ")";
    }
}
