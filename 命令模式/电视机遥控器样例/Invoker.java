package 命令模式.电视机遥控器样例;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands=new ArrayList<>();
    public void setCommand(Command command)
    {
        commands.add(command);
    }
    
    public void executeCommands()
    {
        for(Command command:commands)
        {
            if(command!=null)
            {
                command.excute();
            }
        }
    }
}
