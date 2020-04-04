package factorymethodpattern.factorymethodextension.extension2;

import factorymethodpattern.factorymethodtype.nvwaexample.Humen;
import factorymethodpattern.factorymethodtype.nvwaexample.WhiteHumen;
import factorymethodpattern.factorymethodtype.nvwaexample.YellowHumen;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: WhiteHumenFactory
 * DATE: 2020/4/4
 * TIME: 20:21
 * VERSION:1.0.0
 * JDK 1.8
 */
public class YellowHumenFactory extends AbstractHumenFactory {
    @Override
    public Humen createHumen() {
        return new YellowHumen();
    }
}
