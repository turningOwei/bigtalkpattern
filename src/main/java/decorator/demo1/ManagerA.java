package decorator.demo1;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:51
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class ManagerA extends Manager {
    private Person person;//给雇员升职

    public ManagerA(Person person) {
        super();
        this.person = person;
    }

    @Override
    public void doCoding() {
        doEarlyWork();
        person.doCoding();
    }
    /**项目经理开始前期准备工作*/
    private void doEarlyWork() {
        System.out.println("项目经理A做需求分析");
        System.out.println("项目经理A做架构设计");
        System.out.println("项目经理A做详细设计");
    }
}
