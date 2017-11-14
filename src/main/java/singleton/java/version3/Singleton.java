package singleton.java.version3;

import singleton.annotation.LazyMan;
import singleton.annotation.ThreadSafe;

/**
 * Created by 002465 on 2017/11/14.
 * 懒汉
 * 线程安全
 * version2升级版本
 */
@LazyMan
@ThreadSafe
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
