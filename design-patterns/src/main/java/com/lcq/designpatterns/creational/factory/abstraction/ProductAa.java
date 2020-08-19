package com.lcq.designpatterns.creational.factory.abstraction;

/**
 * @ClassName: ProductAa
 * @Description: 具体产品（矿泉水）
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:20
 * @Version: 1.0
 **/
public class ProductAa extends ProductA {
    @Override
    void intro() {
        System.out.println("矿泉水");
    }
}
