package com.lcq.designpatterns.action.command;

/**
 * @ClassName: PlayCommand
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:45
 * @Version: 1.0
 **/
public class PlayCommand implements Command {

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
