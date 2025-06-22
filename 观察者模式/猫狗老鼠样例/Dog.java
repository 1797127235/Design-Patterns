package 观察者模式.猫狗老鼠样例;

public class Dog implements Onserver {
    @Override
    public void update()
    {
        System.out.println("狗叫");
    }
}
