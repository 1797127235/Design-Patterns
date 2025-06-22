package 命令模式.电视机遥控器样例;

public class TVChangeCommand implements Command{
    private Televison televison;
    public TVChangeCommand(Televison televison)
    {
        this.televison=televison;
    }
    @Override
    public void excute()
    {
        televison.changeChannel();
    }
}
