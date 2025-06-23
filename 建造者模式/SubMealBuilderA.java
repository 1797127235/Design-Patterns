package 建造者模式;

public class SubMealBuilderA extends MealBuilder{
    @Override
    public void buildFood() {
        super.getMeal().setFood("汉堡");
    }
    @Override
    public void buildDrink() {
        super.getMeal().setDrink("可乐");
    }
    @Override
    public Meal getMeal() {
        return super.meal;
    }
}
