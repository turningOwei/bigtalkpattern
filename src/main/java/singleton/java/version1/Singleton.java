package singleton.java.version1;

import singleton.annotation.LazyMan;
import singleton.annotation.NotThreadSafe;

/**
 * Created by 002465 on 2017/11/14.
 * 懒汉
 * 线程不安全
 */
@LazyMan
@NotThreadSafe
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
