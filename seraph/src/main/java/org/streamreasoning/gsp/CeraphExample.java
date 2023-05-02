package org.streamreasoning.gsp;

import org.apache.commons.configuration.ConfigurationException;
import org.streamreasoning.gsp.data.PGStream;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.data.Source;
import org.streamreasoning.gsp.engine.*;
import org.streamreasoning.rsp4j.api.engine.config.EngineConfiguration;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.stream.data.DataStream;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

public class CeraphExample {

    static Seraph sr;

    public static EngineConfiguration aDefault;

    public static void main(String[] args) throws ConfigurationException, IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        //Load engine configuration from yasper/target/classes/csparql.properties
        EngineConfiguration ec = EngineConfiguration.loadConfig("/csparql.properties");

        //Create new seraph engine with the loaded configuration
        Seraph sr = new Seraph(ec);

        //parses the seraph query and saves the information into a continuous query
        ContinuousQuery q = QueryFactory.parse("" +
                "REGISTER <kafka://example> {\n" +
                "FROM STREAM  <http://stream1> STARTING FROM LATEST\n" +
                "WITH WINDOW RANGE PT10S\n" +
                "MATCH (n:Person)-[p]->(n1:Person)\n" +
                "RETURN *\n" +
                "EMIT SNAPSHOT EVERY PT5S " +
                "INTO <http://stream2> }\n");

        //register the parsed seraph query as Neo4jContinuousQueryExecution
        ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>, Map<String, Object>> cqe = sr.register(q);

        //Create a thread that creates the property graph stream for each stream registered in the ContinuousQueryExecution
       Arrays.stream(cqe.instream()).forEach(s -> {
            new Thread(new Source(s)).start();
        });


        //add Consumer to the outstream that outputs the timestamp, key and value for each update of the output stream
        //cqe.outstream().addConsumer((arg, ts) -> System.out.println(ts + "---> (" + arg + ")"));
        cqe.outstream().addConsumer((arg, ts) -> arg.forEach((k, v) -> System.out.println(ts + "---> (" + k + "," + v + ")")));

    }
}
