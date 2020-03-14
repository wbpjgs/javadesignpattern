package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:浓咖啡
 * CLASSNAME: Espresso
 * DATE: 2020/3/8
 * TIME: 17:04
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "espresso ";
    }

    @Override
    double cost() {
        return 2.5;
    }
}
