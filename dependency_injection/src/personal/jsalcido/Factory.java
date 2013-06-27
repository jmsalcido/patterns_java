package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Factory {

    private Factory() {
    }

    /**
     * create a Something class using the IFoo, IVar and IBar class implementations in the constructor
     * @return
     */
    public static Something createSomething() {
        return new Something(new Foo(), new Var(), new Bar());
    }
}
