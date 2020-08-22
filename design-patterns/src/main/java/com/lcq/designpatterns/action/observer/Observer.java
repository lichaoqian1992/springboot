package com.lcq.designpatterns.action.observer;

/**
 * @ClassName: Observer
 * @Description: 抽象观察者角色类
 * @Author: lichaoqian
 * @Date: 2020/8/19 17:26
 * @Version: 1.0
 **/
public interface Observer {

    /**
     * 传入主题对象，方便获取相应的主题对象的状态
     */
    void update(Subject subject);
}
