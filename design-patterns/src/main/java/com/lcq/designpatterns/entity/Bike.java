package com.lcq.designpatterns.entity;

/**
 * @ClassName: Bike
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/12 18:52
 * @Version: 1.0
 **/
public class Bike extends Vehicle {

    public Bike() {
        System.out.println("生成Bike成功");
    }
    public Bike(String name) {
        super(name);
    }

    @Override
    public Vehicle newInstance() {
        return new Bike();
    }

}
