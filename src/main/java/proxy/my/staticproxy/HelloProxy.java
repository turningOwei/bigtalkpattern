package proxy.my.staticproxy;

/**
 * Created by 002465 on 2017/10/11.
 */
public class HelloProxy implements Hello {
    private Hello hello;

    public HelloProxy() {
        hello = new HelloImpl();
    }

    @Override
    public void sayHi() {
        before();
        hello.sayHi();
        after();
    }

    public void before(){
        System.out.println("before");
    }

    public void after(){
        System.out.println("after");
    }

    public static void main(String[] args) {
        Hello hello = new HelloProxy();
        hello.sayHi();
    }
}
