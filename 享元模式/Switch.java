package 享元模式;

public class Switch extends NetworkDevice {
    @Override
    public void use() {
        System.out.println("使用交换机");
    }

    @Override
    public String getDeviceType() {
        return "交换机";
    }
}
