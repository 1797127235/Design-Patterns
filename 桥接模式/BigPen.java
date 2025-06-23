package 桥接模式;

public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        System.out.println(color.getColor()+"大号毛笔绘制"+name);
    }
}
