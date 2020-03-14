package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO: 奶泡调料
 * CLASSNAME: Whip
 * DATE: 2020/3/8
 * TIME: 17:13
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "whip " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 2.5 + beverage.cost();
    }
}
