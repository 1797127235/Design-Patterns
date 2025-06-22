package 命令模式.服务员厨师样例;
import java.util.HashMap;
import java.util.Map;

//点餐
public class Order {
    private int table;
    private Map<String,Integer> foodDir=new HashMap<String,Integer>();
    
    public int getTable() {
        return table;
    }
    public void setTable(int table) {
        this.table = table;
    }
    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }
    public void setFoodDir(String name,int num) {
        this.foodDir.put(name, num);
    }
}
