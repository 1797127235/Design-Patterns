package 状态模式;

public class OpeningState extends LiftState {
    @Override
    public void open()
    {
        //System.out.println("电梯门已经开启....");
    }
    @Override
    public void close()
    {
        System.out.println("电梯门关闭....");
        super.context.setState(Context.CLOSING_STATE);
        super.context.close();
    }
    
    @Override
    public void run()
    {
        System.out.println("电梯门开启，不能运行");
        // super.context.setState(Context.RUNNING_STATE);
        // super.context.run();
    }
    @Override
    public void stop()
    {
        System.out.println("电梯门开启时停止,自动关门");
        super.context.setState(Context.CLOSING_STATE);
        super.context.close();
    }
}
