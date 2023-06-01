package org.streamreasoning.gsp;

//import org.streamreasoning.rsp4j.yasper.querying.syntax.QueryFactory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;
import org.streamreasoning.gsp.data.PGStream;
import org.streamreasoning.gsp.data.PGraph;
import org.streamreasoning.gsp.data.Source;
import org.streamreasoning.gsp.engine.*;
import org.streamreasoning.rsp4j.api.engine.config.EngineConfiguration;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.ContinuousQueryExecution;
import org.streamreasoning.rsp4j.api.stream.data.DataStream;



public class TestParsing {

    static Seraph sr;
    public static EngineConfiguration aDefault;

    public static void main(String[] args) throws IOException, ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        //Load engine configuration from yasper/target/classes/csparql.properties
        EngineConfiguration ec = EngineConfiguration.loadConfig("/seraph.properties");

        //Create new seraph engine with the loaded configuration
        Seraph sr = new Seraph(ec);


//        TEST QUERY STUDENT TRICK
//
//        TIMESTAMPS IN EPOCH MILLI:S
//                14.10.2022 14:45 Uhr --> 1665758700000
//                14.10.2022 15:00 Uhr --> 1665759600000
//                14.10.2022 15:15 Uhr --> 1665760500000
//                14.10.2022 15:20 Uhr --> 1665760800000
//                14.10.2022 15:40 Uhr --> 1665762000000

        ContinuousQuery studentTrick = QueryFactory.parse("" +
                "REGISTER QUERY <student_trick> STARTING AT 2022-10-14T14:45 {\n" +
                    "WITH duration({minutes : 5}) as _5m,\n" +
                        "duration({minutes : 20}) as _20m\n" +
                    "MATCH (s:Station)<-[r1:rentedAt]-(b1:Bike)\n" +
//                        "(b1)-[n1:returnedAt]->(p:Station),\n" +
//                        "(p)<-[r2:rentedAt]-(b2:Bike|E-Bike),\n" +
//                        "(b2)-[n2:returnedAt]->(o:Station)\n" +
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

        //register the parsed seraph query as Neo4jContinuousQueryExecution
        ContinuousQueryExecution<PGraph, PGraph, Map<String, Object>, Map<String, Object>> cqe = sr.register(studentTrick);



        System.out.println();
        System.out.println("----------TEST PARSING----------");


    }
}

