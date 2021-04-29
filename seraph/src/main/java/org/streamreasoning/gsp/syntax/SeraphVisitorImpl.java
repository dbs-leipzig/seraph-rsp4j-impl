package org.streamreasoning.gsp.syntax;


import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class SeraphVisitorImpl extends SeraphBaseVisitor<ContinuousQuery> {

    private String cypher;
    private Map<String, S2R> inputs = new HashMap<>();
    private Map<String, R2S> outputs = new HashMap<>();


    @Override
    public ContinuousQuery visitOS_S2R(SeraphParser.OS_S2RContext ctx) {
        String input = ctx.input.getText().replace("<", "").replace(">", "");
        String starting = ctx.starting.getText();
        Duration range = Duration.parse(ctx.range.getText());

        inputs.put(input, new S2R(starting, range));

        return super.visitOS_S2R(ctx);
    }

    @Override
    public ContinuousQuery visitOS_R2S(SeraphParser.OS_R2SContext ctx) {

        Duration periodD = null;
        Integer periodE = null;

        if (ctx.period.oS_Duration() != null) {
            periodD = Duration.parse(ctx.period.oS_Duration().getText());
        } else
            periodE = Integer.parseInt(ctx.period.oS_EventRange().oC_IntegerLiteral().getText());

        String op = ctx.op.getText().replace("<", "").replace(">", "");
        String output = ctx.output.getText();

        outputs.put(output, new R2S(op, periodD, periodE));

        return super.visitOS_R2S(ctx);
    }

    @Override
    public ContinuousQuery visitOS_R2R(SeraphParser.OS_R2RContext ctx) {
        this.cypher = ctx.getText();
        return super.visitOS_R2R(ctx);
    }


    public SeraphQL getQuery() {
        return new SeraphQL(new R2R(cypher), inputs, outputs);
    }


}
