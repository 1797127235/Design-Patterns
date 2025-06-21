package 状态模式;

public class ClosingState extends LiftState {
    @Override
    public void open()
    {
        System.out.println("电梯门开启");
        super.context.setState(Context.OPENING_STATE);
        super.context.open();
    }
    @Override
    public void close()
    {

    }
    @Override
    public void stop()
    {
        System.out.println("电梯停止");
        super.context.setState(Context.STOPPING_STATE);
        super.context.stop();
    }
    @Override
    public void run()
    {
        System.out.println("电梯运行");
        super.context.setState(Context.RUNNING_STATE);
        super.context.run();
    }
}
