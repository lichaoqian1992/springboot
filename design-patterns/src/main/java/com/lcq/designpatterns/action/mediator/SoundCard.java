package com.lcq.designpatterns.action.mediator;

/**
 * @ClassName: VideoCard
 * @Description: 同事类-声卡
 * @Author: lichaoqian
 * @Date: 2020/8/20 10:23
 * @Version: 1.0
 **/
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     */
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }
}
