package com.lcq.designpatterns.action.iterator;

/**
 * @ClassName: Aggregate
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:51
 * @Version: 1.0
 **/
public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代子对象的接口
     * @return
     */
    public abstract Iterator createIterator();
}
