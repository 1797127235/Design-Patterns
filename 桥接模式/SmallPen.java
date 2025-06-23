package 桥接模式;

public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        System.out.println(color.getColor()+"小号毛笔绘制"+name);
    }
}
