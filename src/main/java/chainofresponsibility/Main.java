package chainofresponsibility;

/**
 * Created by 002465 on 2017/9/29.
 */
public class Main {
    public static void main(String[] args) {
        Handler groupLeader, manager, hr;

        groupLeader = new GroupLeader("王明");
        manager = new Manager("赵强");
        hr = new HRDepartment("李波");

        groupLeader.setSuccessor(manager); // 排传递顺序
        manager.setSuccessor(hr);


        Client lr4 = new Client("赵六", 10);
        groupLeader.handleRequest(lr4);

    }
}
