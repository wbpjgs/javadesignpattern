package factorymethodpattern.factorymethodtype.nvwaexample;

/**
 * USER:wbpjgs
 * TOTO:YellowHumen
 * CLASSNAME: BlackHumen
 * DATE: 2020/4/4
 * TIME: 16:54
 * VERSION:1.0.0
 * JDK 1.8
 */
public class YellowHumen implements Humen {
    public void getColor() {
        System.out.println("我的皮肤是黄色");
    }

    public void chat() {
        System.out.println("我用汉语和别人交流");
    }
}
