package 建造者模式;

public class SubMealBuilderB extends MealBuilder{
    @Override
    public void buildFood() {
        super.getMeal().setFood("薯条");
    }
    @Override
    public void buildDrink() {
        super.getMeal().setDrink("果汁");
    }
    @Override
    public Meal getMeal() {
        return super.meal;
    }
}
