package com.lcq.designpatterns.action.iterator;

/**
 * @ClassName: Iterator
 * @Description: 抽象迭代子角色类
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:52
 * @Version: 1.0
 **/
public interface Iterator {

    /**
     * 迭代方法：移动第一个元素
     */
    void first();

    /**
     * 迭代方法：移动到下一个元素
     */
    void next();

    /**
     * 迭代方法：是否为最后一个元素
     */
    boolean isDone();

    /**
     * 迭代方法：返回当前元素
     */
    Object currentItem();
}
