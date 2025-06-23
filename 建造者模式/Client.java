package 建造者模式;

public class Client {
    public static void main(String[] args) {
        MealBuilder mb=new SubMealBuilderA();
        KFCWaiter waiter=new KFCWaiter();
        waiter.setMealBuilder(mb);
        Meal meal=waiter.construct();
        meal.show();
    }
}
