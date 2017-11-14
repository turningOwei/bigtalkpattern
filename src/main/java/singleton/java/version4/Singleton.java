package singleton.java.version4;

import singleton.annotation.LazyMan;
import singleton.annotation.ThreadSafe;

/**
 * Created by 002465 on 2017/11/14.
 * 懒汉
 * 线程安全
 * fix version3的bug
 * 原因编译器优化,重排序
 */
@LazyMan
@ThreadSafe
public class Singleton {
    private volatile static Singleton instance;

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
