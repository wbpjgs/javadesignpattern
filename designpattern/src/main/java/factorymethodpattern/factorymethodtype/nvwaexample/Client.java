package factorymethodpattern.factorymethodtype.nvwaexample;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: Client
 * DATE: 2020/4/4
 * TIME: 16:42
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Client {
    public static void main(String[] args) {
        AbstractHumenFactory factory = new HumenFactory();
        final WhiteHumen whiteHumen = factory.createHumen(WhiteHumen.class);
        final YellowHumen yellowHumen = factory.createHumen(YellowHumen.class);
        final BlackHumen blackHumen = factory.createHumen(BlackHumen.class);
        blackHumen.getColor();
        blackHumen.chat();
        yellowHumen.getColor();
        yellowHumen.chat();
        whiteHumen.getColor();
        whiteHumen.chat();
    }
}
