package singletonpattern.hungrytype;

/**
 * USER:wbpjgs
 * TOTO:饿汉式单例模式
 * CLASSNAME: Singleton
 * DATE: 2020/4/4
 * TIME: 11:51
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething...");
    }

}
