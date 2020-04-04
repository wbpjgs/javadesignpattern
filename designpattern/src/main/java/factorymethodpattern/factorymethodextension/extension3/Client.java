package factorymethodpattern.factorymethodextension.extension3;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: Client
 * DATE: 2020/4/4
 * TIME: 20:35
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Client {
    public static void main(String[] args) {
        final Singleton instance = SingletonFactory.getInstance();
        instance.doSomething();
    }
}
