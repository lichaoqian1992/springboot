package com.lcq.designpatterns.action.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MacroAudioCommand
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:59
 * @Version: 1.0
 **/
public class MacroAudioCommand implements MacroCommand {

    private List<Command> commandList = new ArrayList<>();

    /**
     * 宏命令聚集管理方法
     * @param cmd
     */
    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }

    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }

    @Override
    public void execute() {
        for (Command cmd : commandList) {
            cmd.execute();
        }
    }
}
