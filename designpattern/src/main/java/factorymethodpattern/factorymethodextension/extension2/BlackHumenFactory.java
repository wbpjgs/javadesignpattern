package factorymethodpattern.factorymethodextension.extension2;

import factorymethodpattern.factorymethodtype.nvwaexample.BlackHumen;
import factorymethodpattern.factorymethodtype.nvwaexample.Humen;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: WhiteHumenFactory
 * DATE: 2020/4/4
 * TIME: 20:21
 * VERSION:1.0.0
 * JDK 1.8
 */
public class BlackHumenFactory extends AbstractHumenFactory {
    @Override
    public Humen createHumen() {
        return new BlackHumen();
    }
}
