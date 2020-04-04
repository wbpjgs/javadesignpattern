package factorymethodpattern.factorymethodextension.extension3;

import java.lang.reflect.Constructor;

/**
 * USER:wbpjgs
 * TOTO:todo
 * CLASSNAME: SingletonFactory
 * DATE: 2020/4/4
 * TIME: 20:31
 * VERSION:1.0.0
 * JDK 1.8
 */
public class SingletonFactory {
    private static Singleton instance = null;
    static {
        try {
            final Class<?> aClass = Class.forName(Singleton.class.getName());
            final Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            instance = (Singleton)declaredConstructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
