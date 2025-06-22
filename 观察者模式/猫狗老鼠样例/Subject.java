package 观察者模式.猫狗老鼠样例;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Onserver> observers=new ArrayList<>();
    public void addObserver(Onserver observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Onserver observer)
    {
        observers.remove(observer);
    }

    public abstract void cry();
}
