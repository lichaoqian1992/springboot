package com.lcq.designpatterns.structure.adapter;

/**
 * @ClassName: Adapter
 * @Description: 类适配器
 * @Author: lichaoqian
 * @Date: 2020/8/20 16:41
 * @Version: 1.0
 **/
public class Adapter extends Adapee implements Target {
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        // 写相关的代码
        System.out.println("补充的方法");
    }
}
