package com.lcq.designpatterns.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Vehicle
 * @Description: 车辆
 * @Author: lichaoqian
 * @Date: 2020/8/12 18:50
 * @Version: 1.0
 **/
public abstract class Vehicle {

    private String name;

    private String color;

    public Vehicle() {

    }

    public Vehicle(String name) {
        this.name = name;
    }

    abstract public Vehicle newInstance();

}
