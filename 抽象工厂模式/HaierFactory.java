package 抽象工厂模式;

public class HaierFactory extends EFactory {
    @Override
    public Televison produceTelevison() {
        return new HaierTelevison();
    }
    @Override
    public Airconditioner produceAirconditioner() {
        return new HaierAirconditioner();
    }
}
