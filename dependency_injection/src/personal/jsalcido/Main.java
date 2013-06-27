package personal.jsalcido;

/**
 * Created with IntelliJ IDEA.
 * User: jsalcido
 * Date: 6/27/13
 * Time: 2:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main{
    public static void main(String[] agrs) {

        // Create the "Something" class thru a Factory.
        Something something = Factory.createSomething();

        // call the doSomething method.
        something.doSomething();
    }
}
