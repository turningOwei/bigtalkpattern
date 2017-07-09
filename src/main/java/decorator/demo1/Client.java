package decorator.demo1;

/**
 * 描述:
 *
 * @author 002465
 * @created 2017/7/9 14:55
 * @return ${return_type}
 * @since v1.0.0
 * ${tags}
 */
public class Client {
    public static void main(String[] args) {
        Person employee = new Employee();
        employee = new ManagerA(employee);//赋予程序员项目经理A职责
        employee = new ManagerB(employee);//赋予程序员项目经理B职责

        employee.doCoding();
    }
}
