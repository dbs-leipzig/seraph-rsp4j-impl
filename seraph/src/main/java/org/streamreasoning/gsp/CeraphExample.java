package org.streamreasoning.gsp;

import org.apache.commons.configuration.ConfigurationException;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.data.Source;
import org.streamreasoning.gsp.engine.QueryFactory;
import org.streamreasoning.gsp.engine.Seraph;
import org.streamreasoning.rsp4j.api.engine.config.EngineConfiguration;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class CeraphExample {

    static Seraph sr;

    public static EngineConfiguration aDefault;

    public static void main(String[] args) throws ConfigurationException, IOException {

        EngineConfiguration ec = EngineConfiguration.loadConfig("/csparql.properties");

        Seraph sr = new Seraph(ec);

        ContinuousQuery q = QueryFactory.parse("" +
                "REGISTER <kafka://example> {\n" +
                "FROM STREAM  <http://stream1> STARTING FROM LATEST\n" +
                "WITH WINDOW RANGE PT10S\n" +
                "MATCH (b1:Bike)-[r1:returnedAt]->(s:Station)\n" +
                //"(b1)-[n1:returnedAt]->(p:Station), \n" +
                //"(b2:Bike)-[r2:rentedAt]->(p), " +
                //"(b2)-[n2:returnedAt]->(o:Station)\n" +
                //"WHERE r1.user_id = 5678.0\n" +
                "RETURN r1.user_id\n" +
                "EMIT SNAPSHOT EVERY PT5S " +
                "INTO <http://stream2> }\n");

        //register the seraph query
        ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>> cqe = sr.register(q);

        Arrays.stream(cqe.instream()).forEach(s -> {
            //Create a thread that creates the property graph stream for each stream registered in the ContinuousQueryExecution
            new Thread(new Source(s)).start();
        });


        cqe.outstream().addConsumer((arg, ts) -> arg.forEach((k, v) -> System.out.println(ts + "---> (" + k + "," + v + ")")));


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("-----------------------------");
            }
        }, 5000, 5000);
    }
}
