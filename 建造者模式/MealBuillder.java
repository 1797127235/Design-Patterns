package 建造者模式;
abstract class MealBuilder{
    protected Meal meal=new Meal();
    public abstract void buildFood();
    public abstract void buildDrink();
    public  Meal getMeal()
    {
        return meal;
    }
};
