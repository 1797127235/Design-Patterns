package 职责链模式;

public class Client {
    public static void main(String[] args) {
        Leader director = new Director("张三");
        Leader manager = new Manager("李四");
        Leader generalManager = new GeneralManager("王五");
        director.setSuccessor(manager);
        manager.setSuccessor(generalManager);
        LeaveRequest leaveRequest =new LeaveRequest("小明", 5);
        director.handleRequest(leaveRequest);
        
    }
}
