package com.lcq.designpatterns.creational.factory.method;

/**
 * @ClassName: ProductA
 * @Description: 具体产品A
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:06
 * @Version: 1.0
 **/
public class ProductA extends Product{

    @Override
    void intro() {
        System.out.println("饮料A");
    }
}
