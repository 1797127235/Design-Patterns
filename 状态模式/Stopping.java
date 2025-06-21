package 状态模式;

public class Stopping extends LiftState {
    @Override
    public void open()
    {
        System.out.println("电梯开门");
        super.context.setState(Context.OPENING_STATE);
        super.context.open();
    }
    @Override
    public void close()
    {
        System.out.println("电梯关门");
        super.context.setState(Context.CLOSING_STATE);
        super.context.close();
    }
    @Override
    public void stop()
    {

    }
    @Override
    public void run()
    {
        System.out.println("电梯运行");
        super.context.setState(Context.RUNNING_STATE);
        super.context.run();
    } 
}
