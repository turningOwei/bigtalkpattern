package practice.staticproxy;

/**
 * Created by 002465 on 2017/10/13.
 */
public class HelloImpl implements Hello{

    @Override
    public void say(String name) {
        System.out.println("HelloImpl!");
    }
}
