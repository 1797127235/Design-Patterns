package 命令模式.电视机遥控器样例;

public class Televison {
    public void open()
    {
        System.out.println("打开电视机");
    }
    public void close()
    {
        System.out.println("关闭电视机");
    }
    public void changeChannel()
    {
        System.out.println("TV切换频道");
    }
    public void setVolume(int volume)
    {
        System.out.println("设置音量到"+volume);
    }
}
