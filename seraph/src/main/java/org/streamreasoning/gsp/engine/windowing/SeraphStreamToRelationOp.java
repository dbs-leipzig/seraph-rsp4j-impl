package org.streamreasoning.gsp.engine.windowing;

import org.apache.commons.rdf.api.IRI;
import org.apache.log4j.Logger;
import org.neo4j.graphdb.GraphDatabaseService;
import org.streamreasoning.gsp.data.PGraphImpl;
import org.streamreasoning.gsp.engine.ContentPGraph;
import org.streamreasoning.gsp.engine.TimeVaryingPGraph;
import org.streamreasoning.rsp4j.api.enums.ReportGrain;
import org.streamreasoning.rsp4j.api.enums.Tick;
import org.streamreasoning.rsp4j.api.exceptions.OutOfOrderElementException;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.ObservableStreamToRelationOp;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.assigner.StreamToRelationOp;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.instance.Window;
import org.streamreasoning.rsp4j.api.operators.s2r.execution.instance.WindowImpl;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;
import org.streamreasoning.rsp4j.api.secret.content.Content;
import org.streamreasoning.rsp4j.api.secret.content.ContentFactory;
import org.streamreasoning.rsp4j.api.secret.report.Report;
import org.streamreasoning.rsp4j.api.secret.time.Time;
import org.streamreasoning.rsp4j.api.stream.data.DataStream;

import java.util.*;
import java.util.stream.Collectors;

public class SeraphStreamToRelationOp<T1, T2> extends ObservableStreamToRelationOp<T1, T2> {

    private final long a;
    private static final Logger log = Logger.getLogger(SeraphStreamToRelationOp.class);
    private GraphDatabaseService db;
    private Map<Window, Content<T1, T2>> windows;

    private Map<T1, Long> r_stream;
    private Map<T1, Long> d_stream;
    private Set<Window> to_evict;
    private long t0;
    private long tc0;
    private long toi;

    Long b = 5000L;

    //ToDo check if works: add content factory to constructor
    public SeraphStreamToRelationOp(IRI iri, long a, Time instance, Tick tick, Report report, ReportGrain grain, ContentFactory<T1, T2> cf) {
        //ToDo add content Factory to call of ObservableStreamToRelationOp
        super(iri, instance, tick, report, grain, cf);
        this.a = a;
        this.t0 = instance.getScope();
        this.toi = 0;
        this.windows = new HashMap<>();
        this.to_evict = new HashSet<>();
        this.tc0 = instance.getScope();
        this.toi = 0;
        this.windows = new HashMap<>();
        this.to_evict = new HashSet<>();
        this.r_stream = new HashMap<>();
        this.d_stream = new HashMap<>();
    }

    /*public SeraphStreamToRelationOp(IRI iri, long a, long b, Time instance, Tick tick, Report report, ReportGrain grain, GraphDatabaseService db) {
        //ToDo add content Factory to call of ObservableStreamToRelationOp
        super(iri, instance, tick, report, grain);
        this.a = a;
        this.b = b;
        this.t0 = instance.getScope();
        this.toi = 0;
        this.windows = new HashMap<>();
        this.to_evict = new HashSet<>();
        this.db = db;
    }*/

    @Override
    public Time time() {
        return time;
    }

    @Override
    public Content<T1, T2> content(long t_e) {
        Optional<Window> max = windows.keySet().stream()
                .filter(w -> w.getO() < t_e && w.getC() <= t_e)
                .max(Comparator.comparingLong(Window::getC));

        if (max.isPresent())
            return windows.get(max.get());

        return cf.createEmpty();
    }

    @Override
    public List<Content<T1, T2>> getContents(long t_e) {
        return windows.keySet().stream()
                .filter(w -> w.getO() <= t_e && t_e < w.getC())
                .map(windows::get).collect(Collectors.toList());
    }

    //ToDo: check if works: copied windowing function from CQELSStreamToRelationOP
    public void windowing(T1 e, long timestamp) {

        long t_e = timestamp;

        if (time.getAppTime() > t_e) {
            throw new OutOfOrderElementException("(" + e + "," + timestamp + ")");
        }

        scope(t_e);

        //todo what if scope returns the active window?
        windows.keySet().forEach(
                scope -> {
                    if (scope.getO() <= t_e && t_e < scope.getC()) {
                        windows.get(scope).add(e);
                    } else if (t_e > scope.getC()) {
                        schedule_for_eviction(scope);
                    }
                });

        windows.keySet().stream()
                .filter(w -> report.report(w, null, t_e, System.currentTimeMillis()))
                .max(Comparator.comparingLong(Window::getC))
                .ifPresent(window -> ticker.tick(t_e, window));

        to_evict.forEach(w -> {
            windows.remove(w);
            if (toi < w.getC())
                toi = w.getC() + b;
        });

        to_evict.clear();
    }
     
    /*public void windowing(T1 e, long ts) {
       //ToDo remove println
        System.out.println("SS2ROP windowing TEST");
        log.debug("Received element (" + e + "," + ts + ")");
        long t_e = ts;

        if (time.getAppTime() > t_e) {
            log.error("OUT OF ORDER NOT HANDLED");
            throw new OutOfOrderElementException("(" + e + "," + ts + ")");
        }

        Window active = scope(t_e);
        Content<T1, T2> content = windows.get(active);

        r_stream.entrySet().stream().filter(ee -> ee.getValue() < active.getO()).forEach(ee -> d_stream.put(ee.getKey(), ee.getValue()));

        r_stream.entrySet().stream().filter(ee -> ee.getValue() >= active.getO()).map(Map.Entry::getKey).forEach(content::add);

        r_stream.put(e, ts);
        content.add(e);

        if (report.report(active, content, t_e, System.currentTimeMillis())) {
            ticker.tick(t_e, active);
        }


        //REMOVE ALL THE WINDOWS THAT CONTAIN DSTREAM ELEMENTS
        //Theoretically active window has always size 1
        d_stream.entrySet().forEach(ee -> {
            log.debug("Evicting [" + ee + "]");

            windows.forEach((window, content1) -> {
                if (window.getO() <= ee.getValue() && window.getC() < ee.getValue())
                    schedule_for_eviction(window);

            });

            r_stream.remove(ee);
        });

        to_evict.forEach(windows::remove);
        to_evict.clear();
    }
    */
    

    //ToDo: check if works: copied scope function from CQELSStreamToRelationOP
    private void scope(long t_e) {

        long c_sup = (long) Math.ceil(((double) Math.abs(t_e - t0) / (double) b)) * b;
        long o_i = c_sup - a;

        do {
            windows
                    .computeIfAbsent(new WindowImpl(o_i, o_i + a), x -> (Content<T1, T2>) new ContentPGraph(db));
            o_i += b;

        } while (o_i <= t_e);

    }
    /*
    private Window scope(long t_e) {
        long o_i = t_e - a;
        log.debug("Calculating the Windows to Open. First one opens at [" + o_i + "] and closes at [" + t_e + "]");
        log.debug("Computing Window [" + o_i + "," + (o_i + a) + ") if absent");

        WindowImpl active = new WindowImpl(o_i, t_e);
        windows.computeIfAbsent(active, window -> cf.create());
        return active;
    }*/



    private void schedule_for_eviction(Window w) {
        to_evict.add(w);
    }

    public Content<T1, T2> compute(long t_e, Window w) {
        Content<T1, T2> content = windows.containsKey(w) ? windows.get(w) : cf.createEmpty();
        time.setAppTime(t_e);
        return setVisible(t_e, w, content);
    }


    @Override
    public TimeVarying<T2> apply(DataStream<T1> s) {
        s.addConsumer(this);
        return this.get();
    }

    @Override
    public StreamToRelationOp<T1, T2> link(ContinuousQueryExecution<T1, T2, ?, ?> context, GraphDatabaseService db) {
        if(db == null){
        }else {
            this.db = db;
        }
        this.addObserver((Observer) context);
        return this;
    }

    @Override
    public StreamToRelationOp<T1, T2> link(ContinuousQueryExecution context) {
        return null;
    }

    @Override
    public TimeVarying<T2> get() {
        return new TimeVaryingPGraph(this, iri, PGraphImpl.createEmpty());
    }
}
