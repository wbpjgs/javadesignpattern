package factorymethodpattern.factorymethodextension.extension2;

import factorymethodpattern.factorymethodtype.nvwaexample.Humen;
import factorymethodpattern.factorymethodtype.nvwaexample.WhiteHumen;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: WhiteHumenFactory
 * DATE: 2020/4/4
 * TIME: 20:21
 * VERSION:1.0.0
 * JDK 1.8
 */
public class WhiteHumenFactory extends AbstractHumenFactory {
    @Override
    public Humen createHumen() {
        return new WhiteHumen();
    }
}
