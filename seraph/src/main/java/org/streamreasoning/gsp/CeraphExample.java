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

        //Load engine configuration from yasper/target/classes/csparql.properties
        EngineConfiguration ec = EngineConfiguration.loadConfig("/csparql.properties");

        //Create new seraph engine with the loaded configuration
        Seraph sr = new Seraph(ec);

        /*
        //TEST QUERY STUDENT TRICK

        //TIMESTAMPS IN EPOCH MILLI:
                14.10.2022 14:45 Uhr --> 1665758700000
                14.10.2022 15:00 Uhr --> 1665759600000
                14.10.2022 15:15 Uhr --> 1665760500000
                14.10.2022 15:20 Uhr --> 1665760800000
                14.10.2022 15:40 Uhr --> 1665762000000

        ContinuousQuery studentTrick = QueryFactory.parse("" +
                "REGISTER QUERY student_trick STARTING AT 2022-10-14T14:45 {\n" +
                    "WITH duration({minutes : 5}) as _5m,\n" +
                        "duration({minutes : 20}) as _20m\n" +
                    "MATCH (s:Station)<-[r1:rentedAt]-(b1:Bike|E-Bike),\n" +
                        "(b1)-[n1:returnedAt]->(p:Station),\n" +
                        "(p)<-[r2:rentedAt]-(b2:Bike|E-Bike),\n" +
                        "(b2)-[n2:returnedAt]->(o:Station)\n" +
                    "WITHIN PT1H\n" +
                    "WHERE r1.user_id = n1.user_id AND\n" +
                        "n1.user_id = r2.user_id AND r2.user_id = n2.user_id AND\n" +
                        "n1.val_time < r2.val_time AND\n" +
                        "duration.between(n1.val_time,r2.val_time) < _5m AND\n" +
                        "duration.between(r1.val_time,n1.val_time) < _20m AND\n" +
                        "duration.between(r2.val_time,n2.val_time) < _20m\n" +
                    "EMIT r1.user_id, s.id, p.id, o.id\n" +
                    "ON ENTERING\n" +
                    "EVERY PT5M\n" +
                "}"
        );
        */

        ContinuousQuery q = QueryFactory.parse("" +
                "REGISTER <kafka://example> {\n" +
                "FROM STREAM  <http://stream1> STARTING FROM LATEST\n" +
                "WITH WINDOW RANGE PT10S\n" +
                "MATCH (b1:Bike)-[r1:rentedAt]->(s:Station)\n" +
                "RETURN r1.user_id\n" +
                "EMIT SNAPSHOT EVERY PT5S " +
                "INTO <http://stream2> }\n");

        //register the parsed seraph query as Neo4jContinuousQueryExecution
        ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>> cqe = sr.register(q);

        //Create a thread that creates the property graph stream for each stream registered in the ContinuousQueryExecution
        Arrays.stream(cqe.instream()).forEach(s -> {
            new Thread(new Source(s)).start();
        });

        //add Consumer to the outstream that outputs the timestamp, key and value for each update of the output stream
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
