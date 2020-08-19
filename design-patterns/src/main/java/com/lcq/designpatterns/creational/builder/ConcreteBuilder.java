package com.lcq.designpatterns.creational.builder;

/**
 * @ClassName: ConcreteBuilder
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 13:43
 * @Version: 1.0
 **/
public class ConcreteBuilder extends Builder {

    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    Product build() {
        return product;
    }

    @Override
    Builder builderA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuildD(msg);
        return this;
    }

}
