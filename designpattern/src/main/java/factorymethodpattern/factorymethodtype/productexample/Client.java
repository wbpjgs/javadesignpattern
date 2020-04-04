package factorymethodpattern.factorymethodtype.productexample;

/**
 * USER:wbpjgs
 * TOTO:客户端
 * CLASSNAME: Client
 * DATE: 2020/4/4
 * TIME: 16:18
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Client {
    public static void main(String[] args) {
        AbstractProductFactory factory = new ProductFactory();
        final Product1 pro1 = factory.createProduct(Product1.class);
        final Product2 pro2 = factory.createProduct(Product2.class);
        pro1.method1();
        pro1.method2();
        pro2.method1();
        pro2.method2();
    }
}
