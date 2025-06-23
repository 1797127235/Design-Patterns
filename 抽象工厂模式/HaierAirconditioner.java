package 抽象工厂模式;

public class HaierAirconditioner implements Airconditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变中");
    }
}
