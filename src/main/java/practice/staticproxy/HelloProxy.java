package practice.staticproxy;

/**
 * Created by 002465 on 2017/10/13.
 */
public class HelloProxy implements Hello {

    private HelloImpl helloImpl;

    public HelloProxy() {
        helloImpl = new HelloImpl();
    }

    @Override
    public void say(String name) {
        before();
        helloImpl.say(name);
        after();
    }


    private void before() {
        System.out.println("proxy before");
    }

    private void after() {
        System.out.println("proxy after");
    }
}
