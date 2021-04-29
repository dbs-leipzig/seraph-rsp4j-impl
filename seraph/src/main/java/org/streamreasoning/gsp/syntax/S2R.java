package org.streamreasoning.gsp.syntax;

import java.time.Duration;

public class S2R {

    String starting;
    Duration step;
    Duration range;

    public void setStep(Duration step) {
        this.step = step;
    }

    public S2R(String starting, Duration range) {
        this.starting = starting;
        this.range = range;
    }

    @Override
    public String toString() {
        return "S2R(" + starting + "," + range + ')';
    }
}