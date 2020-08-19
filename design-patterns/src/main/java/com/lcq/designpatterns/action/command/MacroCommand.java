package com.lcq.designpatterns.action.command;

/**
 * @ClassName: MacroCommand
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:58
 * @Version: 1.0
 **/
public interface MacroCommand extends Command {

    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    void add(Command cmd);

    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    void remove(Command cmd);
}
