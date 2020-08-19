package com.lcq.designpatterns.action.command;

import lombok.Setter;

/**
 * @ClassName: Keypad
 * @Description: 请求者角色，有键盘类扮演
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:49
 * @Version: 1.0
 **/
public class Keypad {
    @Setter
    private Command playCommand;
    @Setter
    private Command rewindCommand;
    @Setter
    private Command stopCommand;

    /**
     * 执行播放方法
     */
    public void play() {
        playCommand.execute();
    }

    /**
     * 执行倒带方法
     */
    public void rewind() {
        rewindCommand.execute();
    }

    /**
     * 执行停止方法
     */
    public void stop() {
        stopCommand.execute();
    }

}
