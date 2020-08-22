package com.lcq.designpatterns.structure.flyweight;

/**
 * @ClassName: Client
 * @Description: java String 就用的享元模式
 * @Author: lichaoqian
 * @Date: 2020/8/21 16:00
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory('a');
        fly.operation("Fisrt Call");

        fly = factory.factory('b');
        fly.operation("Second Call");

        fly = factory.factory('a');
        fly.operation("Thrid Call");
        String a="";
    }
}
