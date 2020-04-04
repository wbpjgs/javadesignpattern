package factorymethodpattern.factorymethodtype.nvwaexample;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: HumenFactory
 * DATE: 2020/4/4
 * TIME: 16:49
 * VERSION:1.0.0
 * JDK 1.8
 */
public class HumenFactory extends AbstractHumenFactory {
    @Override
    public <T extends Humen> T createHumen(Class<T> c) {
        Humen humen = null;
        try {
            humen = (Humen) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) humen;
    }
}
