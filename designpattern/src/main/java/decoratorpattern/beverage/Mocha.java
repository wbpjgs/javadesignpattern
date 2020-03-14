package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:摩卡调料
 * CLASSNAME: Mocha
 * DATE: 2020/3/8
 * TIME: 17:12
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "mocha " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.5 + beverage.cost();
    }
}
