package 桥接模式;

public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
        System.out.println(color.getColor()+"中号毛笔绘制"+name);
    }
}
