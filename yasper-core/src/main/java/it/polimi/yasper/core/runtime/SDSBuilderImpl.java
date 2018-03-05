package it.polimi.yasper.core.runtime;

import it.polimi.yasper.core.enums.StreamOperator;
import it.polimi.yasper.core.rspql.ContinuousQueryExecution;
import it.polimi.yasper.core.rspql.SDS;
import it.polimi.yasper.core.rspql.SDSBuilder;
import it.polimi.yasper.core.rspql.Stream;
import it.polimi.yasper.core.spe.report.Report;
import it.polimi.yasper.core.spe.report.ReportGrain;
import it.polimi.yasper.core.spe.scope.Tick;
import it.polimi.yasper.core.spe.windowing.WindowOperator;
import it.polimi.yasper.core.spe.windowing.assigner.WindowAssigner;
import it.polimi.yasper.core.utils.EngineConfiguration;
import it.polimi.yasper.core.utils.QueryConfiguration;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.rdf.api.Graph;
import org.apache.commons.rdf.api.IRI;
import org.apache.commons.rdf.api.RDF;
import org.apache.commons.rdf.simple.SimpleRDF;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class SDSBuilderImpl implements SDSBuilder<ContinuousQueryImpl> {

    @NonNull
    private Map<String, Stream> registeredStreams;
    @NonNull
    private EngineConfiguration engine_config;
    @NonNull
    private QueryConfiguration query_config;
    @NonNull
    private Report report;
    @NonNull
    private ReportGrain reportGrain;
    @NonNull
    private Tick tick;
    private ContinuousQueryExecutionImpl cqe;

    @Override
    public void visit(ContinuousQueryImpl query) {

        String id = query.getID();

        RDF rdf = new SimpleRDF();

        Set<DefaultStreamView> defaultStreamViews = new HashSet<>();

        Map<WindowOperator, Stream> windows = query.getWindowMap();
        Map<IRI, NamedStreamView> nametvgs = new HashMap<>();

        windows.forEach((wo, s) -> {

            Stream s1 = registeredStreams.get(s.getURI());
            WindowAssigner wa = wo.apply(s1);

            wa.setReport(report);
            wa.setTick(tick);
            wa.setReportGrain(reportGrain);

            if (wo.isNamed()) {
                NamedStreamView g = new NamedStreamView(wa);
                nametvgs.put(rdf.createIRI(wo.getName()), g);
                wa.setView(g);
            } else {
                DefaultStreamView dg = new DefaultStreamView();
                defaultStreamViews.add(dg);
                wa.setView(dg);
            }
        });

        Map<IRI, Graph> namedGraphs = query.getNamedGraphs();
        Set<Graph> graphs = query.getGraphs();

        SDSImpl sds = new SDSImpl(graphs, namedGraphs, defaultStreamViews, nametvgs);

        StreamOperator r2S = query.getR2S();
        this.cqe = new ContinuousQueryExecutionImpl(sds, query, r2S);

        nametvgs.forEach((k, v) -> cqe.add(v));
        boolean recursive = query.isRecursive();

    }


    @Override
    public SDS getSDS() {
        return null;
    }

    @Override
    public ContinuousQueryImpl getContinuousQuery() {
        return null;
    }

    @Override
    public ContinuousQueryExecution getContinuousQueryExecution() {
        return cqe;
    }
}