package org.streamreasoning.rsp4j.api.secret.time;

public interface Time {

    long getScope();

    long getAppTime();

    void setAppTime(long now);

    default long getSystemTime() {
        return System.currentTimeMillis();
    }

    ET getEvaluationTimeInstants();

    void addEvaluationTimeInstants(TimeInstant i);

}
