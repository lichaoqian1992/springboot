package com.lcq.designpatterns.action.command;

/**
 * @ClassName: AudioPlayer
 * @Description: 接收者角色，有录音机类扮演
 * @Author: lichaoqian
 * @Date: 2020/8/19 15:43
 * @Version: 1.0
 **/
public class AudioPlayer {

    public void play() {
        System.out.println("播放...");
    }

    public void rewind() {
        System.out.println("倒带...");
    }

    public void stop() {
        System.out.println("停止...");
    }
}
