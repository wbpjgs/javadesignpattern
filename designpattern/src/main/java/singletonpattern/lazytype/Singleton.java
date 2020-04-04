package singletonpattern.lazytype;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * USER:wbpjgs
 * TOTO:懒汉式单例模式
 * CLASSNAME: Singleton
 * DATE: 2020/4/4
 * TIME: 11:55
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Singleton {
    //加volatile目的是禁止指令重排序
    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //DCK 双端检锁机制
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething...");
    }

}
