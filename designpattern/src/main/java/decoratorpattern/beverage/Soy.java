package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:豆浆调料
 * CLASSNAME: Soy
 * DATE: 2020/3/8
 * TIME: 17:13
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "soy " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 2.0 + beverage.cost();
    }
}

