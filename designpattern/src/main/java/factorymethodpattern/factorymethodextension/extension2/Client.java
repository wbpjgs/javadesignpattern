package factorymethodpattern.factorymethodextension.extension2;

import com.sun.org.apache.bcel.internal.generic.NEW;
import factorymethodpattern.factorymethodtype.nvwaexample.Humen;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: Clientt
 * DATE: 2020/4/4
 * TIME: 20:24
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Client {
    public static void main(String[] args) {
        Humen whiteHumen = (new WhiteHumenFactory()).createHumen();
        Humen balckHumen = (new BlackHumenFactory()).createHumen();
        Humen yellowHumen = (new YellowHumenFactory()).createHumen();
        whiteHumen.getColor();
        whiteHumen.chat();
        balckHumen.getColor();
        balckHumen.chat();
        yellowHumen.getColor();
        yellowHumen.chat();
    }
}
