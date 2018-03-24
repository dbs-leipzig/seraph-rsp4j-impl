package it.polimi.yasper.simple;

import it.polimi.yasper.core.stream.Stream;
import it.polimi.yasper.core.quering.ContinuousQuery;
import it.polimi.yasper.core.quering.execution.ContinuousQueryExecution;
import it.polimi.yasper.simple.querying.ContinuousQueryImpl;
import it.polimi.yasper.simple.querying.formatter.InstResponseSysOutFormatter;
import it.polimi.yasper.simple.streaming.RunnableStream;
import it.polimi.yasper.core.utils.EngineConfiguration;
import it.polimi.yasper.core.utils.QueryConfiguration;
import org.apache.commons.configuration.ConfigurationException;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Riccardo on 03/08/16.
 */
public class TestConfig {

    static RSPEngineImpl sr;

    public static void main(String[] args) throws InterruptedException, IOException, ConfigurationException {

        URL resource = TestConfig.class.getResource("/default.properties");
        QueryConfiguration config = new QueryConfiguration(resource.getPath());
        EngineConfiguration ec = EngineConfiguration.loadConfig("/default.properties");

        sr = new RSPEngineImpl(0, ec);

        RunnableStream painter = new RunnableStream("painter");

        Stream painter_reg = sr.register(painter);

        //_____


        ContinuousQuery q = new ContinuousQueryImpl();

        ContinuousQueryExecution cqe = sr.register(q, config);

        cqe.addFormatter(new InstResponseSysOutFormatter());

        //In real application we do not have to start the stream.

    }


}