package decoratorpattern.beverage;

/**
 * USER:wbpjgs
 * TOTO:beverage decorator test class
 * CLASSNAME: MainTest
 * DATE: 2020/3/8
 * TIME: 17:25
 * VERSION:1.0.0
 * JDK 1.8
 */
public class MainTest {
    public static void main(String[] args) {
        //我想要一杯加了牛奶、摩卡的脱因咖啡
        Beverage decaf = new Decaf();
        decaf = new Milk(new Mocha(decaf));
        //输出原料和价钱
        System.out.println("decaf description:" + decaf.getDescription());
        System.out.println("my decaf :" + decaf.cost());
        System.out.println("==================");
        //我想要一杯加了豆浆、奶泡的烘焙咖啡
        Beverage darkroast = new DarkRoast();
        darkroast = new Soy(new Whip(darkroast));
        //输出原料和价钱
        System.out.println("decaf darkroast:" + darkroast.getDescription());
        System.out.println("my darkroast :" + darkroast.cost());
    }
}
