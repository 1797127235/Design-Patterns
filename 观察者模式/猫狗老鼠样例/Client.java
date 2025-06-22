package 观察者模式.猫狗老鼠样例;

public class Client {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        Mouse mouse=new Mouse();
        cat.addObserver(dog);
        cat.addObserver(mouse);
        cat.cry();
    }
    
}
