package com.lcq.designpatterns.creational.factory.method;

/**
 * @ClassName: FactoryA
 * @Description: 具体工厂A(负责具体的产品A生产)
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:09
 * @Version: 1.0
 **/
public class FactoryA extends Factory {
    @Override
    Product getProduct() {
        return new ProductA();
    }
}
