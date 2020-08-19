package com.lcq.designpatterns.creational.prototype;

/**
 * @ClassName: Circle
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 14:39
 * @Version: 1.0
 **/
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
