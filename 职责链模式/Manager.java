package 职责链模式;

public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println(name + "批准了" + leaveRequest.getLeaveName() + "的请假，请假天数为" + leaveRequest.getLeaveDays());
        }
        else{
            if(this.successor != null)
            {
                this.successor.handleRequest(leaveRequest);
            }
            else
            {
                System.out.println("请假天数超过10天，无人批准");
            }
        }
    }
}
