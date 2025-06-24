package 组合模式.水果盘样例;

import java.util.ArrayList;
import java.util.List;

public class Plate extends MyElement {
    private List<MyElement> list = new ArrayList<MyElement>();

    @Override
    public void eat() {
        for(MyElement element : list)
        {
            element.eat();
        }
    }

    public void add(MyElement element)
    {
        list.add(element);
    }
    public void remove(MyElement element)
    {
        list.remove(element);
    }
    public List<MyElement> getList()
    {
        return list;
    }
}
