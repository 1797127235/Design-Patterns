package 建造者模式;

public class Meal {
    private String food;
    private String drink;
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getDrink() {
        return drink;
    }
    public void setDrink(String drink) {
        this.drink = drink;
    }
    public void show(){
        System.out.println("food:"+food);
        System.out.println("drink:"+drink);
    }
}
