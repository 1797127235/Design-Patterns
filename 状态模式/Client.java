package 状态模式;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        
        // 为所有状态设置context引用
        Context.OPENING_STATE.setContext(context);
        Context.CLOSING_STATE.setContext(context);
        Context.RUNNING_STATE.setContext(context);
        Context.STOPPING_STATE.setContext(context);
        
        context.setState(Context.OPENING_STATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
