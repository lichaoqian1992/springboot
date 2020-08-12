package com.lcq.designpatterns.entity;

/**
 * @ClassName: Truck
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/12 18:52
 * @Version: 1.0
 **/
public class Truck extends Vehicle {
    public Truck() {

    }
    public Truck(String name) {
        super(name);
    }

    @Override
    public Vehicle newInstance() {
        return new Truck();
    }

}
