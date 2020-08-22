package com.lcq.designpatterns.action.mediator;

/**
 * @ClassName: VideoCard
 * @Description: 同事类-显卡
 * @Author: lichaoqian
 * @Date: 2020/8/20 10:23
 * @Version: 1.0
 **/
public class VideoCard extends Colleague {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 显示视频数据
     */
    public void showData(String data) {
        System.out.println("您正在观看的是：" + data);
    }
}
