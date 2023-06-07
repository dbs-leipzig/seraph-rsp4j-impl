package org.streamreasoning.gsp.engine;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.streamreasoning.gsp.syntax.SeraphLexer;
import org.streamreasoning.gsp.syntax.SeraphParser;
import org.streamreasoning.gsp.syntax.SeraphVisitorImpl;
import org.streamreasoning.gsp.syntax.ThrowingErrorListener;
import org.streamreasoning.rsp4j.api.querying.ContinuousQuery;
import org.streamreasoning.rsp4j.api.querying.syntax.CaseChangingCharStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class QueryFactory {

    static ThrowingErrorListener listener = ThrowingErrorListener.INSTANCE;

    public static ContinuousQuery parse(String queryString) throws IOException {

        System.out.println(queryString);
        InputStream inputStream = new ByteArrayInputStream(queryString.getBytes());
        return parse(inputStream);
    }

    public static ContinuousQuery parse(InputStream inputStream) throws IOException {
        // Ignore case for keywords
        CaseChangingCharStream charStream = new CaseChangingCharStream(CharStreams.fromStream(inputStream), true);
        SeraphLexer lexer = new SeraphLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(listener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SeraphParser parser = new SeraphParser(tokens);
        parser.setErrorHandler(new DefaultErrorStrategy());
        parser.removeErrorListeners();
        parser.addErrorListener(listener);

        SeraphVisitorImpl visitor = new SeraphVisitorImpl();

        visitor.visit(parser.oC_Seraph());

        return visitor.getQuery();
    }
}
