package 观察者模式.公众号样例;

public class User implements Observer {
    private String name;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}
