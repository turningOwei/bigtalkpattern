package chainofresponsibility;

/**
 * Created by 002465 on 2017/9/29.
 */
public class HRDepartment extends Handler {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Client request) {
        if(request.getLeaveDays() <= 3){
            System.out.println("hr" + name + "审批员工" + request.getLeaveName()
                    + "的请假条，请假天数为" + request.getLeaveDays() + "天。");
        }else {
            if(this.successor != null){
                System.out.println("请假天数超出,hr"+name+"请求上层领导"+this.successor.name+"签字");
                this.successor.handleRequest(request);
            }else{
                System.out.println("请假天数超出,没有上层领导,不予请假");
            }
        }
    }
}
