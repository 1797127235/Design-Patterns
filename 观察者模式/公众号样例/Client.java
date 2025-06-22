package 观察者模式.公众号样例;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();
        subject.attach(new User("张三"));
        subject.attach(new User("李四"));
        subject.attach(new User("王五"));
        subject.notify("公众号更新了");
        
    }
}
