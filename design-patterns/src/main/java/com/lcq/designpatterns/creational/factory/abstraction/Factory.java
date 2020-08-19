package com.lcq.designpatterns.creational.factory.abstraction;


/**
 * @ClassName: Factory
 * @Description: 抽象工厂
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:08
 * @Version: 1.0
 **/
public abstract class Factory {
    /**
     * 生产饮料
     * @return
     */
    abstract Product getProductA();

    /**
     * 生产零食
     * @return
     */
    abstract Product getProductB();
}
