package factorymethodpattern.factorymethodtype.productexample;

/**
 * USER:wbpjgs
 * TOTO:生产产品
 * CLASSNAME: ProductFactory
 * DATE: 2020/4/4
 * TIME: 16:26
 * VERSION:1.0.0
 * JDK 1.8
 */
public class ProductFactory extends AbstractProductFactory {
    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> c) {
        AbstractProduct product = null;
        try {
            product = (AbstractProduct) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
