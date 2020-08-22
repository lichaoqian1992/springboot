package com.lcq.designpatterns.action.memento;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:10
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        // 改变发起人对象的状态
        o.setState("On");
        // 创建备忘录对象，并将发起人对象的状态存储到负责人对象
        c.saveMemento(o.createMemento());
        // 修改发起人的状态
        o.setState("Off");
        // 恢复发起人对象的状态
        o.restoreMemento(c.retrieveMemento());
        System.out.println(o.getState());
    }
}
