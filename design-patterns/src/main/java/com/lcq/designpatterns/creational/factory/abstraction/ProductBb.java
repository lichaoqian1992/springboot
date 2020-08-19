package com.lcq.designpatterns.creational.factory.abstraction;

/**
 * @ClassName: ProductBb
 * @Description: 具体产品（面包）
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:21
 * @Version: 1.0
 **/
public class ProductBb extends ProductB {
    @Override
    void intro() {
        System.out.println("面包");
    }
}
