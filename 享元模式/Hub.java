package 享元模式;

public class Hub extends NetworkDevice {
    @Override
    public void use() {
        System.out.println("使用集线器");
    }

    @Override
    public String getDeviceType() {
        return "集线器";
    }
}
