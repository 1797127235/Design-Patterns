package 状态模式;

public class Context {
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static Stopping STOPPING_STATE = new Stopping();
    LiftState liftState;

    public LiftState getState()
    {
        return liftState;
    }

    public void setState(LiftState liftState)
    {
        this.liftState=liftState;
    }

    public void open()
    {
        this.liftState.open();
    }
    public void close()
    {
        this.liftState.close();
    }

    public void run()
    {
        this.liftState.run();
    }

    public void stop()
    {
        this.liftState.stop();
    }
}
