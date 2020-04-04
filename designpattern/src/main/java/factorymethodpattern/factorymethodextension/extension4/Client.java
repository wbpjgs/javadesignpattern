package factorymethodpattern.factorymethodextension.extension4;

import factorymethodpattern.factorymethodtype.productexample.AbstractProduct;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: Client
 * DATE: 2020/4/4
 * TIME: 20:42
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Client {
    public static void main(String[] args) {
        final AbstractProduct product1 = ProductFactory.createProduct("product1");
        final AbstractProduct product2 = ProductFactory.createProduct("product2");
        final AbstractProduct pro2 = ProductFactory.createProduct("product2");
        product1.method2();
        product2.method2();
        pro2.method2();

    }
}
