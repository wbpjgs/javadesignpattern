package factorymethodpattern.factorymethodextension.extension1;

import factorymethodpattern.factorymethodtype.nvwaexample.Humen;

/**
 * USER:wbpjgs
 * TOTO:简单工厂模式
 * CLASSNAME: HumenFactory
 * DATE: 2020/4/4
 * TIME: 20:10
 * VERSION:1.0.0
 * JDK 1.8
 */
public class HumenFactory {
    public static <T extends Humen> T createHumen(Class<T> c) {
        Humen humen = null;
        try {
            humen = (Humen) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) humen;
    }
}
