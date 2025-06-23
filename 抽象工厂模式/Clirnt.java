package 抽象工厂模式;

public class Clirnt {
    public static void main(String[] args) {
        EFactory factory=new HaierFactory();
        Televison televison=factory.produceTelevison();
        Airconditioner airconditioner=factory.produceAirconditioner();
        televison.play();
        airconditioner.changeTemperature();
        EFactory factory2=new TCLFactory();
        Televison televison2=factory2.produceTelevison();
        Airconditioner airconditioner2=factory2.produceAirconditioner();
        televison2.play();
        airconditioner2.changeTemperature();
    }
}
