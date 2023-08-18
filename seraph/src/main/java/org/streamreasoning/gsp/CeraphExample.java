package org.streamreasoning.gsp;

import org.apache.commons.configuration.ConfigurationException;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.data.Source;
import org.streamreasoning.gsp.engine.*;
import org.streamreasoning.rsp4j.api.engine.config.EngineConfiguration;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class CeraphExample {

    static Seraph sr;

    public static EngineConfiguration aDefault;

    public static void main(String[] args) throws ConfigurationException, IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        //Load engine configuration from yasper/target/classes/csparql.properties
        EngineConfiguration ec = EngineConfiguration.loadConfig("/seraph.properties");

        //Create new seraph engine with the loaded configuration
        Seraph sr = new Seraph(ec);


        ContinuousQuery q = QueryFactory.parse("" +
                "REGISTER QUERY <student_trick> STARTING AT 2022-10-14T14:45 {\n" +
                "MATCH (b1:Bike)-[r1:rentedAt]->(s:Station)\n" +
                "WITHIN PT10S\n" +
                "RETURN r1.user_id\n" +
                "ON ENTERING\n" +
                "EVERY PT5S\n" +
                "}");


        q.setInputStream("http://stream1");
        q.setOutputStream("http://stream2");

        //register the parsed seraph query as Neo4jContinuousQueryExecution
        ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>, Map<String, Object>> cqe = sr.register(q);

        //Create a thread that creates the property graph stream for each stream registered in the ContinuousQueryExecution
       Arrays.stream(cqe.instream()).forEach(s -> {
            new Thread(new Source(s)).start();
        });


        //add Consumer to the outstream that outputs the timestamp, key and value for each update of the output stream
        AtomicLong consideredTime = new AtomicLong();
        cqe.outstream().addConsumer((arg, ts) ->
                {
                    // pretty console log
                    if(consideredTime.get() != ts){
                        System.out.println("---------------------");
                        consideredTime.set(ts);
                    }

                    arg.forEach((k, v) -> System.out.println(ts + " ---> (" + k + "," + v + ")"));

                }
        );

    }
}
