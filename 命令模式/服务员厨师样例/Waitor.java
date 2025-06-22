package 命令模式.服务员厨师样例;

import java.util.ArrayList;
import java.util.List;
//服务员类
public class Waitor {
    private List<Command> commands=new ArrayList<Command>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void notifyCommand() {
        System.out.println("通知厨师");
        for(Command command:commands)
        {
            if(command!=null)
            {
                command.excute();
            }
        }
    }
}
