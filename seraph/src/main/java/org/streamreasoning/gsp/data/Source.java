package org.streamreasoning.gsp.data;

import org.streamreasoning.rsp4j.api.stream.data.WebDataStream;

import java.util.ArrayList;
import java.util.List;

public class Source implements Runnable{

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

//                List<SocialNetworkEvent> e = new ArrayList<>();

                stream.put(new PGraphImpl(), System.currentTimeMillis());
//            stream.put(new PGraphImplAvro(e, System.currentTimeMillis());

                Thread.sleep(4000);
            }
        } catch (
                InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }


}
