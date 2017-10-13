package proxy.my.staticproxy;

/**
 * Created by 002465 on 2017/10/11.
 */
public class HelloImpl implements Hello {
    @Override
    public void sayHi() {
        System.out.println("hi,everyone!");
    }
}
