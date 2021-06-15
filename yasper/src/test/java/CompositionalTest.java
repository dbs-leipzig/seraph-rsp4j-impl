import org.apache.commons.rdf.api.RDF;
import org.junit.Test;
import org.streamreasoning.rsp4j.api.RDFUtils;
import org.streamreasoning.rsp4j.api.sds.timevarying.TimeVarying;
import org.streamreasoning.rsp4j.yasper.querying.operators.r2r.*;
import org.streamreasoning.rsp4j.yasper.sds.SDSImpl;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;

public class CompositionalTest {

    @Test
    public void pipe() throws InterruptedException {

        RDF instance = RDFUtils.getInstance();

        VarOrTerm s = new VarImpl("s");
        VarOrTerm p = new TermImpl(instance.createIRI("p"));
        VarOrTerm o = new VarImpl("o");

        SDSImpl sds = new SDSImpl();

        sds.add(instance.createQuad(null, instance.createIRI("S1"), instance.createIRI("p"), instance.createIRI("O1")));
        sds.add(instance.createQuad(null, instance.createIRI("S2"), instance.createIRI("q"), instance.createIRI("O2")));
        sds.add(instance.createQuad(null, instance.createIRI("S3"), instance.createIRI("p"), instance.createIRI("O3")));

        BGP bgp = new BGP(sds, s, p, o);

        Stream<Binding> eval = bgp.eval(0);
//        eval.forEach(System.out::println);
//        bgp.eval(0).forEach(System.err::println);

        Filter<Binding> filter = new Filter<>(bgp.eval(0), binding -> binding.value(o).equals(instance.createIRI("O3")));
        Stream<Binding> eval1 = filter.eval(0);
//        eval1.forEach(System.out::println);

//        bgp.eval(0).filter(Objects::nonNull).map(filter).filter(Objects::nonNull).forEach(System.err::println);

        filter = new Filter<>(bgp.eval(0), binding -> binding.value(o).equals(instance.createIRI("O3")));

        Projection projection = new Projection(filter.eval(0), s);

        Stream<Binding> eval2 = projection.eval(0);
        eval2.forEach(System.out::println);

        bgp.eval(0).map(filter).filter(Objects::nonNull).map(projection).forEach(System.err::println);

    }

    @Test
    public void lazy() {

        RDF instance = RDFUtils.getInstance();

        VarOrTerm s = new VarImpl("s");
        VarOrTerm p = new TermImpl(instance.createIRI("p"));
        VarOrTerm o = new VarImpl("o");

        SDSImpl sds = new SDSImpl();

        sds.add(instance.createQuad(null, instance.createIRI("S1"), instance.createIRI("p"), instance.createIRI("O1")));
        sds.add(instance.createQuad(null, instance.createIRI("S2"), instance.createIRI("q"), instance.createIRI("O2")));
        sds.add(instance.createQuad(null, instance.createIRI("S3"), instance.createIRI("p"), instance.createIRI("O3")));

        BGP bgp = new BGP(sds, s, p, o);

        TimeVarying<Collection<Binding>> bgpres = bgp.apply();
        bgpres.materialize(0);

        Filter<Binding> filter = new Filter<>(bgpres, binding -> binding.value(o).equals(instance.createIRI("O3")));

        TimeVarying<Collection<Binding>> fres = filter.apply();
        fres.materialize(0);
        Projection projection = new Projection(fres, s);

        TimeVarying<Collection<Binding>> pres = projection.apply();
        pres.materialize(0);
        Collection<Binding> bindings = pres.get();
        bindings.forEach(System.out::println);

        bgp.eval(0).map(filter).filter(Objects::nonNull).map(projection).forEach(System.err::println);
    }
}
