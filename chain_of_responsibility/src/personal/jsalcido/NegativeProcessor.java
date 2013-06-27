package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class NegativeProcessor extends Processor {

    @Override
    protected boolean accept(Object request) {
        return (Integer)request < 0;
    }

    @Override
    protected void doHandle(Object request) {
        System.out.println(String.format("n = %d is negative.", (Integer)request));
    }
}
