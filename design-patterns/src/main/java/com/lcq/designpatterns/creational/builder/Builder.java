package com.lcq.designpatterns.creational.builder;

/**
 * @ClassName: Builder
 * @Description: 建造者
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:47
 * @Version: 1.0
 **/
public abstract class Builder {

    // 汉堡
    abstract Builder builderA(String msg);

    // 饮料
    abstract Builder builderB(String msg);

    // 薯条
    abstract Builder builderC(String msg);

    // 甜品
    abstract Builder builderD(String msg);

    // 获取套餐
    abstract Product build();
}
