package factorymethodpattern.factorymethodextension.extension4;

import factorymethodpattern.factorymethodtype.productexample.AbstractProduct;
import factorymethodpattern.factorymethodtype.productexample.Product1;
import factorymethodpattern.factorymethodtype.productexample.Product2;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: ProductFactory
 * DATE: 2020/4/4
 * TIME: 20:37
 * VERSION:1.0.0
 * JDK 1.8
 */
public class ProductFactory  {
    private static Map<String, AbstractProduct> map = new HashMap();
    public static synchronized AbstractProduct createProduct(String type) {
        AbstractProduct product = null;
        if (map.containsKey(type)) {
            System.out.println("从缓存取到的产品，产品类型为"+type);
            product = map.get(type);
        } else {
            if ("product1".equals(type)) {
                product = new Product1();
            } else {
                product = new Product2();
            }
            map.put(type,product);
        }
        return product;
    }
}
