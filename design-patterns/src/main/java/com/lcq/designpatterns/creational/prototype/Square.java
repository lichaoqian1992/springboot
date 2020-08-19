package com.lcq.designpatterns.creational.prototype;


/**
 * @ClassName: ConcreteBuilder
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 13:43
 * @Version: 1.0
 **/
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
