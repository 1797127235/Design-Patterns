package 抽象工厂模式;

public class TCLTelevison implements Televison {
    @Override
    public void play() {
        System.out.println("TCL电视机播放中");
    }
}
