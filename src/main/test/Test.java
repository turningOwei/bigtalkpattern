import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.SoftReference;

/**
 * Created by 002465 on 2017/10/17.
 */
public class Test {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Integer a = new Integer("1");
        SoftReference softReference = new SoftReference(a);
        String b = "";
        String c = "aa";

        if(b.equals(c)){



        }
    }
}
