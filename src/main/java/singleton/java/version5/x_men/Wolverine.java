package singleton.java.version5.x_men;

/**
 * Created by 002465 on 2017/11/14.
 * 金刚狼
 */
public class Wolverine {
    private static final Wolverine instance;

    static {
        instance = new Wolverine();
    }

    private Wolverine() {
    }

    public static Wolverine getInstance() {
        return instance;
    }
}
