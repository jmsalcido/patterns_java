package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String... args) {
        Processor p1 = new NegativeProcessor();
        Processor p2 = new ZeroProcessor();
        Processor p3 = new PositiveProcessor();

        p1.setNext(p2);
        p2.setNext(p3);

        p1.process(new Integer(55));
        p1.process(new Integer(-90));
        p1.process(new Integer(44));
        p1.process(new Integer(0));
    }
}
