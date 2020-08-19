package com.lcq.designpatterns.creational.factory.method;

/**
 * @ClassName: Factory
 * @Description: 抽象工厂
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:08
 * @Version: 1.0
 **/
public abstract class Factory {
    /**
     * 生产产品
     * @return
     */
    abstract Product getProduct();
}
