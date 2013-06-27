package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 10:15 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Processor implements IChain {

    // I dont know "why" volatile
    // I saw this:
    //
    // “… the volatile modifier guarantees that any thread that reads a field will see the most recently written value.” - Josh Bloch
    //
    // I will take his word.
    protected volatile IChain next;

    /**
     * set the next chain element
     * @param next
     */
    public final void setNext(IChain next) {
        this.next = next;
    }

    /**
     * process the request
     * @param request
     */
    public final void process(Object request) {
        if(this.accept(request)) {
            this.doHandle(request);
        } else {
            // this may throw an exception right?
            try {
                next.process(request);
            } catch (NullPointerException npe) {
                System.out.println("No element at the chain could process this request, sorry for your time wasted.");
            }
        }
    }

    /**
     * if the request is true the process method will do a callback to the method doHandle
     * @param request
     * @return
     */
    protected abstract boolean accept(Object request);

    /**
     * handle the request
     * @param request
     */
    protected abstract void doHandle(Object request);
}
