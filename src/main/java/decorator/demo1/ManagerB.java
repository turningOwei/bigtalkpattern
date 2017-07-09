package decorator.demo1;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:53
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class ManagerB extends Manager {
    private Person person;//给雇员升职

    public ManagerB(Person person) {
        super();
        this.person = person;
    }

    @Override
    public void doCoding() {
        person.doCoding();
        doEndWork();
    }
    /**项目经理开始项目收尾工作*/
    private void doEndWork() {
        System.out.println("项目经理B 在做收尾工作");
    }
}
