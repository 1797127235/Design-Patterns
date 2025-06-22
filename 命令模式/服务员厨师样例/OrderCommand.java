package 命令模式.服务员厨师样例;

//具体命令类
public class OrderCommand  implements Command{
    private Order order;
    private SeniorChef receiver;
    public void setOrder(Order order) {
        this.order = order;
    }
    public void setReceiver(SeniorChef receiver) {
        this.receiver = receiver;
    }
    @Override
    public void excute() {
        System.out.println(order.getTable()+"桌的订单：");

        order.getFoodDir().forEach((k,v)->{
            receiver.cook(k, v);
        });
        System.out.println("订单完成");
    }
}