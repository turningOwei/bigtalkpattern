package decorator.demo1;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:50
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class Employee implements Person {
    @Override
    public void doCoding() {
        System.out.println("程序员加班写程序，终于写完了。。。");
    }
}
