package factorymethodpattern.factorymethodtype.productexample;

/**
 * USER:wbpjgs
 * TOTO:抽象产品类
 * CLASSNAME: AbstractProduct
 * DATE: 2020/4/4
 * TIME: 16:21
 * VERSION:1.0.0
 * JDK 1.8
 */
public abstract class AbstractProduct {
    protected void method1() {
        System.out.println("产品类公共方法");
    }

    public abstract void method2();
}
