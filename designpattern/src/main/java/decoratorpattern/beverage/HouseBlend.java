package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: HouseBlend
 * DATE: 2020/3/8
 * TIME: 16:57
 * VERSION:1.0.0
 * JDK 1.8
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "houseblend ";
    }

    @Override
    double cost() {
        return 1.5;
    }
}
