package 命令模式.电视机遥控器样例;

public class TVOpenCommand implements Command{
    private Televison televison;
    public TVOpenCommand(Televison televison)
    {
        this.televison=televison;
    }
    @Override
    public void excute()
    {
        televison.open();
    }
}
