package practice.staticproxy;

/**
 * Created by 002465 on 2017/10/13.
 */
public class Client {
    public static void main(String[] args) {
        Hello proxy = new HelloProxy();
        proxy.say("hello");
    }
}
