package com.lcq.designpatterns.action.memento;

/**
 * @ClassName: Originator
 * @Description: 发起人角色类
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:05
 * @Version: 1.0
 **/
public class Originator {

    private String state;

    /**
     * 工厂方法，返回一个新的备忘录对象
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人恢复好备忘录对象所记载的对象
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }
}
