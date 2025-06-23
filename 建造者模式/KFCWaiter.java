package 建造者模式;
//指挥者
public class KFCWaiter {
    private MealBuilder mb;
    public void setMealBuilder(MealBuilder mb){
        this.mb=mb;
    }
    //组装
    public Meal construct(){
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
