package com.lcq.designpatterns.action.memento;

/**
 * @ClassName: Caretaker
 * @Description: 负责人角色类
 * @Author: lichaoqian
 * @Date: 2020/8/20 11:08
 * @Version: 1.0
 **/
public class Caretaker {

    private Memento memento;

    /**
     * 备忘录的取值方法
     */
    public Memento retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
