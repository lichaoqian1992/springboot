package com.lcq.designpatterns.creational.factory.abstraction;

/**
 * @ClassName: FactoryA
 * @Description: 具体工厂A(负责具体A类产品生产)
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:22
 * @Version: 1.0
 **/
public class FactoryA extends Factory {
    @Override
    Product getProductA() {
        // 生产矿泉水
        return new ProductAa();
    }

    @Override
    Product getProductB() {
        // 生产面包
        return new ProductBb();
    }
}
