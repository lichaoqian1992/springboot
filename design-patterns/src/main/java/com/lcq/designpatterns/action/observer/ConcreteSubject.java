package com.lcq.designpatterns.action.observer;

/**
 * @ClassName: ConcreteSubject
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 17:29
 * @Version: 1.0
 **/
public class ConcreteSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为：" + state);
        // 状态发生改变，通知各个观察者
        this.notifyObservers();
    }
}
