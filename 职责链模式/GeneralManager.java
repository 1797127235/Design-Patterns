package 职责链模式;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 30) {
            System.out.println(name + "批准了" + leaveRequest.getLeaveName() + "的请假，请假天数为" + leaveRequest.getLeaveDays());
        }
        else{
            if(this.successor != null)
            {
                this.successor.handleRequest(leaveRequest);
            }
            else
            {
                System.out.println("请假天数超过30天，该员工想辞职了");
            }
        }
    }
}
