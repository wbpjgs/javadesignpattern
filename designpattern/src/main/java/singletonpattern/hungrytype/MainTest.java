package singletonpattern.hungrytype;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: MainTest
 * DATE: 2020/4/4
 * TIME: 11:53
 * VERSION:1.0.0
 * JDK 1.8
 */
public class MainTest {
    public static void main(String[] args) {
        final Singleton instance = Singleton.getInstance();
        instance.doSomething();
    }
}
