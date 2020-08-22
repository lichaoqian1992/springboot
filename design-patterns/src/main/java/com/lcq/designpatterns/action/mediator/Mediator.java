package com.lcq.designpatterns.action.mediator;

/**
 * @ClassName: Mediator
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 9:45
 * @Version: 1.0
 **/
public interface Mediator {

    /**
     * 同时对象在自身改变的时候来通知调停者方法
     * 让调停者取负责相应的与其他同时对象的交互
     */
    void changed(Colleague c);
}
