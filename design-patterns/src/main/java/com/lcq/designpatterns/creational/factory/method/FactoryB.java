package com.lcq.designpatterns.creational.factory.method;

/**
 * @ClassName: FactoryB
 * @Description: 具体工厂B (负责具体的产品B生产)
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:09
 * @Version: 1.0
 **/
public class FactoryB extends Factory {
    @Override
    Product getProduct() {
        return new ProductB();
    }
}
