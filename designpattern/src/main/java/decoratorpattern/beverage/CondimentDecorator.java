package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:调料装饰器
 * CLASSNAME: CondimentDecorator
 * DATE: 2020/3/8
 * TIME: 17:08
 * VERSION:1.0.0
 * JDK 1.8
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract double cost();
}
