package singleton.java.version6;

import singleton.annotation.LazyMan;
import singleton.annotation.ThreadSafe;

/**
 * Created by 002465 on 2017/11/14.
 */
@ThreadSafe
@LazyMan
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}
    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static Class getClass(String classname)
            throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if(classLoader == null)
            classLoader = Singleton.class.getClassLoader();

        return (classLoader.loadClass(classname));
    }

}
