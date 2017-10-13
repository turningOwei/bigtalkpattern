package proxy.dynamicproxy;

import proxy.my.staticproxy.Hello;
import proxy.my.staticproxy.HelloImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by 002465 on 2017/10/11.
 */
public class DynamicProxyGraceful implements InvocationHandler {
    private Object target;

    public DynamicProxyGraceful(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    private void after() {
        System.out.println("dynamic after");
    }

    private void before() {
        System.out.println("dynamic before");
    }

    public <T> T getProxy(){
        T helloProxy = (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
        return helloProxy;
    }

    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        DynamicProxyGraceful dynamicProxy = new DynamicProxyGraceful(hello);

        Hello helloProxy = dynamicProxy.getProxy();
        helloProxy.sayHi();
    }
}
