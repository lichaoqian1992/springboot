package com.lcq.designpatterns.action.observer;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 17:32
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        // 创建观察者对象
        Observer observer = new ConcreteObserver();
        // 将观察者对象注册到主题对象上
        subject.attach(observer);
        // 改变主题对象的状态
        subject.change("new state");
    }
}
