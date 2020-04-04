package factorymethodpattern.factorymethodtype.productexample;

/**
 * USER:wbpjgs
 * TOTO:抽象工厂类
 * CLASSNAME: AbstractProduct
 * DATE: 2020/4/4
 * TIME: 16:19
 * VERSION:1.0.0
 * JDK 1.8
 */
public abstract class AbstractProductFactory {
    public abstract <T extends AbstractProduct> T createProduct(Class<T> c);
}
