package com.lcq.designpatterns.action.command;

/**
 * @ClassName: RewindCommand
 * @Description: 倒带
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:47
 * @Version: 1.0
 **/
public class RewindCommand implements Command {

    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
