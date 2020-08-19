package com.lcq.designpatterns.creational.builder;

/**
 * @ClassName: Test
 * @Description: 测试类
 * @Author: lichaoqian
 * @Date: 2020/8/19 13:47
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();

        Product build = concreteBuilder
                    .builderA("牛肉煲")
//                    .builderC("全家桶")
                    .builderD("冰淇淋")
                    .build();
        System.out.println(build.toString());
    }
}
