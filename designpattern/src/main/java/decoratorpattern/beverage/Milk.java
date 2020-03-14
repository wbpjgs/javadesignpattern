package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:
 * CLASSNAME: Mild
 * DATE: 2020/3/8
 * TIME: 17:10
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Milk extends CondimentDecorator{
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "milk " +beverage.getDescription();
    }

    @Override
    public double cost() {
        return 1.5 + beverage.cost();
    }
}
