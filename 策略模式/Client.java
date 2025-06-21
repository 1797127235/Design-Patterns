package 策略模式;
public class Client {
    public static void main(String[] args) {
        strategy s = new strategyB();
        SaleMan sm = new SaleMan(s);
        sm.sale();
        sm.setStrategy(new strategyC());
        sm.sale();
    }
}