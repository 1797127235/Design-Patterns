package 抽象工厂模式;

public class TCLconditioner implements Airconditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度改变中");
    }
}
