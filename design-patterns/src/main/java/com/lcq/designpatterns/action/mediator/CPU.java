package com.lcq.designpatterns.action.mediator;

import lombok.Getter;

/**
 * @ClassName: CPU
 * @Description: 同事类CPU
 * @Author: lichaoqian
 * @Date: 2020/8/20 10:18
 * @Version: 1.0
 **/
public class CPU extends Colleague{

    /**
     * 分解出来的视频
     */
    @Getter
    private String videoData = "";

    /**
     * 分解出来的声音数据
     */
    @Getter
    private String soundData = "";

    /**
     * 构造函数
     * @param mediator
     */
    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 处理数据，把数据分成音频和视频的数据
     */
    public void executeData(String data) {
        // 把数据分解开，前面是视频数据，后面是音频数据
        String[] array = data.split(",");
        this.videoData = array[0];
        this.soundData = array[1];
        // 通知主板，CPU完成工作
        getMediator().changed(this);
    }


}
