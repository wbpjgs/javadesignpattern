package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:脱因咖啡
 * CLASSNAME: Decaf
 * DATE: 2020/3/8
 * TIME: 17:05
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Decaf extends Beverage{
    public Decaf() {
        this.description = "decaf ";
    }

    @Override
    double cost() {
        return 3.0;
    }
}
