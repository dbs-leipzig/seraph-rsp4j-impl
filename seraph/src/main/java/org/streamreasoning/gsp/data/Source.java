package org.streamreasoning.gsp.data;

import com.google.gson.Gson;
import org.streamreasoning.rsp4j.api.stream.data.WebDataStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//TODO create method to set a source from either the query or the example class
public class Source implements Runnable {

    public Source(WebDataStream<PGraph> stream) {
        this.stream = stream;
    }

    private final WebDataStream<PGraph> stream;

    @Override
    public void run() {
        try {
            String topic = "sne-avro";
//        AvroConsumer ac = new AvroConsumer(topic);

            while (true) {
//            ac.consume();
                try {
                    //Create a property graph using the test.json as a base
                    URL url = Source.class.getClassLoader().getResource("test.json");
                    FileReader fileReader = new FileReader(url.getPath());
                    PGraph pGraph = PGraphImpl.fromJson(fileReader);
                    stream.put(pGraph, pGraph.timestamp());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Thread.sleep(4000);
            }
        } catch (
                InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }


}
