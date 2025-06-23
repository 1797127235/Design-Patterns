package 抽象工厂模式;

public class TCLFactory extends EFactory {
    @Override
    public Televison produceTelevison() {
        return new TCLTelevison();
    }
    @Override
    public Airconditioner produceAirconditioner() {
        return new TCLconditioner();
    }
}
