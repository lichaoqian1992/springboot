package com.lcq.designpatterns.creational.factory.method;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:11
 * @Version: 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //创建具体的工厂
        Factory factoryA = new FactoryA();
        // 生产对应的产品
        factoryA.getProduct().intro();
        Factory factoryB = new FactoryB();
        factoryB.getProduct().intro();
    }
}
