package com.lcq.designpatterns.action.mediator;

import lombok.Setter;

/**
 * @ClassName: ConcreteMediator
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 9:48
 * @Version: 1.0
 **/
public class MainBoard implements  Mediator {

    // 需要知道要叫胡的同事类-光驱类
    @Setter
    private CDDriver cdDriver;

    // 需要知道要交互的同事类-CPU类
    @Setter
    private CPU cpu;

    // 需要知道要交互的同事类——显卡类
    @Setter
    private VideoCard videoCard;

    // 需要知道要交互的同事类——声卡类
    @Setter
    private SoundCard soundCard;

    @Override
    public void changed(Colleague c) {
        if (c instanceof CDDriver) {
            // 表示光驱读取数据了
            this.openCDDriverReadData((CDDriver) c);
        } else if (c instanceof CPU) {
            this.openCPU((CPU) c);
        }
    }

    /**
     * 处理光驱读取数据以后与其他对象的交互
     * @param cd
     */
    private void openCDDriverReadData(CDDriver cd) {
        // 先获取光驱读取的数据
        String data = cd.getData();
        // 先把这些数据传递给CPU进行处理
        cpu.executeData(data);
    }

    /**
     * 处理CPU处理完数据后与其他对象的交互
     */
    private void openCPU(CPU cpu) {
        // 先获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        // 把这些数据传递给显卡和声卡显示出来
        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }
}
