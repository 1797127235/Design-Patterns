package 命令模式.电视机遥控器样例;

public class Client {
    public static void main(String[] args) {
        Televison televison=new Televison();
        Command openCommand=new TVOpenCommand(televison);
        Command closeCommand=new TVCloseCommand(televison);
        Command changeCommand=new TVChangeCommand(televison);
        Invoker invoker=new Invoker();
        invoker.setCommand(openCommand);
        invoker.setCommand(closeCommand);
        invoker.setCommand(changeCommand);
        invoker.executeCommands();
    }
}
