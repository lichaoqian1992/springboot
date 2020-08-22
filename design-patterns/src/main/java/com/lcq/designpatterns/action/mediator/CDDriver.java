package com.lcq.designpatterns.action.mediator;

import lombok.Getter;

/**
 * @ClassName: CDDriver
 * @Description: 同事类-光驱
 * @Author: lichaoqian
 * @Date: 2020/8/20 9:46
 * @Version: 1.0
 **/
public class CDDriver extends Colleague {

    // 光驱读出来的数据
    @Getter
    private String data = "";

    public CDDriver(Mediator mediator){
        super(mediator);
    }

    /**
     * 读取光盘
     */
    public void readCD() {
        // 逗号前是视频显示的数据，逗号后是声音
        this.data = "One Piece, 海贼王我当定了";
        // 通知主板，自己的状态发生了改变
        getMediator().changed(this);
    }
}
