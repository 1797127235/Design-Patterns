package 享元模式;

public class Client {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new DeviceFactory();
        NetworkDevice device1 = deviceFactory.getDevice("交换机");
        device1.use();
        NetworkDevice device2 = deviceFactory.getDevice("集线器");
        device2.use();
    }
}
