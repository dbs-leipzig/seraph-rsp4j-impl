package org.streamreasoning.gsp.engine.windowing;

import org.apache.commons.rdf.api.IRI;
import org.neo4j.graphdb.GraphDatabaseService;
import org.streamreasoning.gsp.EmptyPGraphContent;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.data.PGraphImpl;
import org.streamreasoning.gsp.engine.ContentPGraph;
import org.streamreasoning.gsp.engine.TimeVaryingPGraph;
import org.streamreasoning.rsp4j.api.enums.ReportGrain;
import org.streamreasoning.rsp4j.api.enums.Tick;
import org.streamreasoning.rsp4j.api.exceptions.OutOfOrderElementException;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.ObservableStreamToRelationOp;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.instance.Window;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.instance.WindowImpl;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.secret.content.Content;
import org.streamreasoning.rsp4j.api.secret.report.Report;
import org.streamreasoning.rsp4j.api.secret.time.Time;

import java.util.*;
import java.util.stream.Collectors;

public class SeraphStreamToRelationOp extends ObservableStreamToRelationOp<PGraph, PGraph> {

    private final long a, b;
    private GraphDatabaseService db;
    private Map<Window, Content<PGraph, PGraph>> active_windows;
    private Set<Window> to_evict;
    private long t0;
    private long toi;

    public SeraphStreamToRelationOp(IRI iri, long a, long b, Time instance, Tick tick, Report report, ReportGrain grain, GraphDatabaseService db) {
        super(iri, instance, tick, report, grain);
        this.a = a;
        this.b = b;
        this.t0 = instance.getScope();
        this.toi = 0;
        this.active_windows = new HashMap<>();
        this.to_evict = new HashSet<>();
        this.db = db;
    }

    @Override
    public Time time() {
        return time;
    }

    @Override
    public Content<PGraph, PGraph> content(long t_e) {
        Optional<Window> max = active_windows.keySet().stream()
                .filter(w -> w.getO() < t_e && w.getC() <= t_e)
                .max(Comparator.comparingLong(Window::getC));

        if (max.isPresent())
            return active_windows.get(max.get());

        return new EmptyPGraphContent();
    }

    @Override
    public List<Content<PGraph, PGraph>> getContents(long t_e) {
        return active_windows.keySet().stream()
                .filter(w -> w.getO() <= t_e && t_e < w.getC())
                .map(active_windows::get).collect(Collectors.toList());
    }

    protected void windowing(PGraph e, long timestamp) {

        long t_e = timestamp;

        if (time.getAppTime() > t_e) {
            throw new OutOfOrderElementException("(" + e + "," + timestamp + ")");
        }

        scope(t_e);

        //todo what if scope returns the active window?
        active_windows.keySet().forEach(
                scope -> {
                    if (scope.getO() <= t_e && t_e < scope.getC()) {
                        active_windows.get(scope).add(e);
                    } else if (t_e > scope.getC()) {
                        schedule_for_eviction(scope);
                    }
                });

        active_windows.keySet().stream()
                .filter(w -> report.report(w, null, t_e, System.currentTimeMillis()))
                .max(Comparator.comparingLong(Window::getC))
                .ifPresent(window -> ticker.tick(t_e, window));

        to_evict.forEach(w -> {
            active_windows.remove(w);
            if (toi < w.getC())
                toi = w.getC() + b;
        });

        to_evict.clear();
    }

    private void scope(long t_e) {
        long c_sup = (long) Math.ceil(((double) Math.abs(t_e - t0) / (double) b)) * b;
        long o_i = c_sup - a;

        do {
            active_windows
                    .computeIfAbsent(new WindowImpl(o_i, o_i + a), x -> new ContentPGraph(db));
            o_i += b;

        } while (o_i <= t_e);

    }


    private void schedule_for_eviction(Window w) {
        to_evict.add(w);
    }

    public Content<PGraph, PGraph> compute(long t_e, Window w) {
        Content<PGraph, PGraph> content = active_windows.containsKey(w) ? active_windows.get(w) : new EmptyPGraphContent();
        time.setAppTime(t_e);
        return setVisible(t_e, w, content);
    }

    @Override
    public void link(ContinuousQueryExecution context) {
        this.addObserver((Observer) context);
    }

    @Override
    public TimeVaryingPGraph get() {
        return new TimeVaryingPGraph(this, iri, PGraphImpl.createEmpty());
    }

}
