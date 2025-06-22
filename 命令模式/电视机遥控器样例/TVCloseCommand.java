package 命令模式.电视机遥控器样例;

public class TVCloseCommand implements Command{
    private Televison televison;
    public TVCloseCommand(Televison televison)
    {
        this.televison=televison;
    }
    @Override
    public void excute()
    {
        televison.close();
    }
}
