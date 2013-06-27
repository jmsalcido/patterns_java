package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 10:15 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Processor implements IChain {

    protected volatile IChain next;

    public final void setNext(IChain next) {
        this.next = next;
    }

    public final void process(Object request) {
        if(this.accept(request)) {
            this.doHandle(request);
        } else {
            next.process(request);
        }
    }

    protected abstract boolean accept(Object request);

    protected abstract void doHandle(Object request);
}
