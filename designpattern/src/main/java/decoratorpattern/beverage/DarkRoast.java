package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: DarkRoast
 * DATE: 2020/3/8
 * TIME: 17:01
 * VERSION:1.0.0
 * JDK 1.8
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "darkroast ";
    }

    @Override
    double cost() {
        return 2.0;
    }
}
