package com.lcq.designpatterns.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Subject
 * @Description: 抽象主题角色类
 * @Author: lichaoqian
 * @Date: 2020/8/19 17:24
 * @Version: 1.0
 **/
public abstract class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attached an observer");
    }

    /**
     * 移除观察者对象
     * @param observer
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     * @param newState
     */
    public void notifyObservers(String newState) {
        for (Observer observer : list) {
            observer.update(newState);
        }
    }
}
