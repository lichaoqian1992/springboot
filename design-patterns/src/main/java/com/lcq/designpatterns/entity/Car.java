package com.lcq.designpatterns.entity;

/**
 * @ClassName: Car
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/12 18:52
 * @Version: 1.0
 **/
public class Car extends Vehicle {

    public Car() {

    }

    public Car(String name) {
        super(name);
    }

    @Override
    public Vehicle newInstance() {
        return new Car();
    }

}
