package org.streamreasoning.gsp.syntax;


import org.streamreasoning.rsp4j.api.enums.StreamOperator;
import org.streamreasoning.rsp4j.api.operators.s2r.syntax.WindowNode;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.secret.time.Time;
import org.streamreasoning.rsp4j.api.secret.time.TimeFactory;
import org.streamreasoning.rsp4j.api.stream.web.WebStream;

import java.util.*;

public class SeraphQL implements ContinuousQuery {

    private R2R r2r;
    private Map<String, S2R> inputs = new HashMap<>();
    private Map<String, R2S> outputs = new HashMap<>();


    public SeraphQL(R2R r2r, Map<String, S2R> inputs, Map<String, R2S> outputs) {
        this.r2r = r2r;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    @Override
    public void addNamedWindow(String s, WindowNode windowNode) {

    }

    @Override
    public void setIstream() {

    }

    @Override
    public void setRstream() {

    }

    @Override
    public void setDstream() {

    }

    @Override
    public boolean isIstream() {
        return false;
    }

    @Override
    public boolean isRstream() {
        return false;
    }

    @Override
    public boolean isDstream() {
        return false;
    }

    @Override
    public void setSelect() {

    }

    @Override
    public void setConstruct() {

    }

    @Override
    public boolean isSelectType() {
        return false;
    }

    @Override
    public boolean isConstructType() {
        return false;
    }

    @Override
    public void setOutputStream(String s) {

    }

    @Override
    public WebStream getOutputStream() {
        return null;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public StreamOperator getR2S() {
        return null;
    }

    @Override
    public boolean isRecursive() {
        return false;
    }

    @Override
    public Map<? extends WindowNode, WebStream> getWindowMap() {
        return null;
    }

    @Override
    public List<String> getGraphURIs() {
        return null;
    }

    @Override
    public List<String> getNamedwindowsURIs() {
        return null;
    }

    @Override
    public List<String> getInputStreams() {
        return new ArrayList<>(inputs.keySet());
    }

    @Override
    public List<String> getNamedGraphURIs() {
        return null;
    }

    @Override
    public List<String> getResultVars() {
        return Arrays.asList(new String[]{"name"});
    }

    @Override
    public String getR2R() {
        return r2r.toString();
    }

    @Override
    public Time getTime() {
        return TimeFactory.getInstance();
    }

}
