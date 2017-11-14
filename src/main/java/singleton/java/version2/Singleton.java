package singleton.java.version2;

import singleton.annotation.LazyMan;
import singleton.annotation.NotThreadSafe;
import singleton.annotation.ThreadSafe;

/**
 * Created by 002465 on 2017/11/14.
 * 懒汉
 * 线程安全
 * 缺点是每次创建都有加锁,耗费资源
 */
@LazyMan
@ThreadSafe
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class){
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
