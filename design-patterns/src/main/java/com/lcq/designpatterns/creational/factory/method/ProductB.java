package com.lcq.designpatterns.creational.factory.method;

/**
 * @ClassName: ProductB
 * @Description: 具体产品B
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:06
 * @Version: 1.0
 **/
public class ProductB extends Product {
    @Override
    void intro() {
        System.out.println("饮料B");
    }
}
