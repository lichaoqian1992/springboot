package com.lcq.designpatterns.creational.factory.abstraction;


import com.lcq.designpatterns.creational.factory.method.FactoryB;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:11
 * @Version: 1.0
 **/
public class Test {

    public static void main(String[] args) {
        //创建零食售卖机（具体工厂），
        Factory factoryA = new FactoryA();
        // 获取矿泉水与面包（具体产品）
        factoryA.getProductA().intro();
        factoryA.getProductB().intro();
    }
}
