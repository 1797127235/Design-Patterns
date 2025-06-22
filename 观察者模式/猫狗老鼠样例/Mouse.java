package 观察者模式.猫狗老鼠样例;

public class Mouse implements Onserver {
    @Override
    public void update()
    {
        System.out.println("老鼠逃跑");
    }
}
