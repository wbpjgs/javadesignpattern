package singletonpattern.twoinstance;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: MainTest
 * DATE: 2020/4/4
 * TIME: 12:08
 * VERSION:1.0.0
 * JDK 1.8
 */
public class MainTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final Instance instance = Instance.getInstance();
            instance.doSomething();
        }
    }
}
