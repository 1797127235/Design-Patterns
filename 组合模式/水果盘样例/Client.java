package 组合模式.水果盘样例;

public class Client{
    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.add(new Apple());
        plate.add(new Banana());
        plate.eat(); 
    }

}
