package 状态模式;

public class RunningState extends LiftState {
    @Override
    public void open()
    {
        System.out.println("电梯运行时不能开门");
    }
    @Override
    public void close()
    {
        System.out.println("电梯运行时不能关门");
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
        System.out.println("电梯已经在运行了");
    }
}
