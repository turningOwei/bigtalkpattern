package singleton.java.version5;

import singleton.annotation.HungryMan;
import singleton.annotation.ThreadSafe;

/**
 * Created by 002465 on 2017/11/14.
 * static修饰就是线程安全
 */
@HungryMan
@ThreadSafe
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
