package factorymethodpattern.factorymethodtype.nvwaexample;

/**
 * USER:wbpjgs
 * TOTO:WhiteHumen
 * CLASSNAME: BlackHumen
 * DATE: 2020/4/4
 * TIME: 16:54
 * VERSION:1.0.0
 * JDK 1.8
 */
public class WhiteHumen implements Humen {
    public void getColor() {
        System.out.println("我的皮肤是白色");
    }

    public void chat() {
        System.out.println("我用汉语和别人交流");
    }
}
