package com.lcq.designpatterns.action.command;

/**
 * @ClassName: StopCommand
 * @Description: 停止
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:47
 * @Version: 1.0
 **/
public class StopCommand implements Command {

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
