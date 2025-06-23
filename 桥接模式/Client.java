package 桥接模式;

public class Client {
    public static void main(String[] args) {
        Pen pen=new BigPen();
        Color color=new RedColor();
        pen.setColor(color);
        pen.draw("花朵");
        pen.setColor(new BlackColor());
        pen.draw("天空");
    }
    
}
