package factorymethodpattern.factorymethodextension.extension1;

import factorymethodpattern.factorymethodtype.nvwaexample.BlackHumen;
import factorymethodpattern.factorymethodtype.nvwaexample.Humen;
import factorymethodpattern.factorymethodtype.nvwaexample.WhiteHumen;
import factorymethodpattern.factorymethodtype.nvwaexample.YellowHumen;

import java.util.Map;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: Client
 * DATE: 2020/4/4
 * TIME: 20:13
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Client {
    public static void main(String[] args) {
        Humen whiteHumen = HumenFactory.createHumen(WhiteHumen.class);
        Humen blackHumen = HumenFactory.createHumen(BlackHumen.class);
        Humen yellowHumen = HumenFactory.createHumen(YellowHumen.class);
        whiteHumen.getColor();
        whiteHumen.chat();
        blackHumen.getColor();
        blackHumen.chat();
        yellowHumen.getColor();
        yellowHumen.chat();
    }
}
