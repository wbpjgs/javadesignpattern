package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:饮料模板
 * CLASSNAME: Beverage
 * DATE: 2020/3/8
 * TIME: 16:54
 * VERSION:1.0.0
 * JDK 1.8
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
