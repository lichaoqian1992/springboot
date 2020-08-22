package com.lcq.designpatterns.structure.adapter;

/**
 * @ClassName: Target
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 16:40
 * @Version: 1.0
 **/
public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    void sampleOpeartion1();

    /**
     * 这是源类Adptee没有的方法
     */
    void sampleOperation2();
}
