package 观察者模式.猫狗老鼠样例;

public class Cat extends Subject {
    @Override
    public void cry()
    {
        for(Onserver observer:observers)
        {
            observer.update();
        }
    }
}
