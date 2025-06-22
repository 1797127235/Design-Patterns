package 命令模式.服务员厨师样例;

public class Client {
    public static void main(String[] args) {
        Order order1=new Order();
        Order order2=new Order();
        order1.setTable(1);
        order2.setTable(2);
        order1.setFoodDir("西红柿鸡蛋", 1);
        order2.setFoodDir("炒饭", 2);

        SeniorChef seniorChef=new SeniorChef();
        //创建命令
        OrderCommand command1=new OrderCommand();
        OrderCommand  command2=new OrderCommand();
        command1.setReceiver(seniorChef);
        command2.setReceiver(seniorChef);

        command1.setOrder(order1);
        command2.setOrder(order2);

        //创建服务员 Invoker类
        Waitor waitor=new Waitor();
        waitor.setCommand(command1);
        waitor.setCommand(command2);
        waitor.notifyCommand();
    }
}
