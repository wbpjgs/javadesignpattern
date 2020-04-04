package singletonpattern.twoinstance;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * USER:wbpjgs
 * TOTO:指定上限的单例模式 MAX_COUNTER_INSTANCE
 * CLASSNAME: TwoInstance
 * DATE: 2020/4/4
 * TIME: 12:02
 * VERSION:1.0.0
 * JDK 1.8
 */
public class Instance {
    //最大数量实例
    private static final int MAX_COUNTER_INSTANCE = 2;

    private static String instanceName = null;

    private static Map<String, Instance> instanceMap = new ConcurrentHashMap<String, Instance>();

    static {
        for (int i = 0; i < MAX_COUNTER_INSTANCE; i++) {
            instanceMap.put("intance" + i, new Instance());
        }
    }

    private Instance() {
    }

    public static Instance getInstance() {
        Random random = new Random();
        final int index = random.nextInt(MAX_COUNTER_INSTANCE);
        instanceName = "intance" + index;
        return instanceMap.get(instanceName);
    }

    public void doSomething() {
        System.out.println(instanceName + " start doSomething...");
    }
}
