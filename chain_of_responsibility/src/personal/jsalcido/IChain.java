package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 10:10 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IChain {

    public void setNext(IChain nextInChain);
    public void process(Object request);

}
