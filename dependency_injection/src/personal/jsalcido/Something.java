package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Something {

    // We will use these interfaces.
    private IFoo foo;
    private IBar bar;
    private IVar var;

    /**
     * create a Something class, receiving the Foo, Var and Bar implementations as parameters,
     * we dont have to create the implementation thru the new keyword (Something does not depend of them)
     * @param foo
     * @param var
     * @param bar
     */
    public Something(Foo foo, Var var, Bar bar) {
        this.foo = foo;
        this.var = var;
        this.bar = bar;
    }

    /**
     * doSomething, really... just call print from these implementations.
     */
    public void doSomething() {
        foo.print();
        var.print();
        bar.print();
    }
}
