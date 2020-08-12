package com.lcq.designpatterns.creational.factory.simple;

import com.lcq.designpatterns.entity.Bike;
import com.lcq.designpatterns.entity.Car;
import com.lcq.designpatterns.entity.Truck;
import com.lcq.designpatterns.entity.Vehicle;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: InstanceFactory
 * @Description: newInstance方法创建
 * @Author: lichaoqian
 * @Date: 2020/8/12 18:47
 * @Version: 1.0
 **/
public class InstanceFactory {

    private static Map<String, Vehicle> map;

    static {
        map = new HashMap<>();
        map.put("bike", new Bike());
        map.put("car", new Car());
        map.put("truck", new Truck());
    }

    public static Vehicle createVehicle(String type) {
        Vehicle vehicle = null;
        Map<String, Vehicle> registeredProdects = new HashMap<>();
        if (map != null && map.get(type) instanceof Vehicle) {
            return map.get(type).newInstance();
        }
        return vehicle;
    }

    public static void main(String[] args) {
        createVehicle("bike");
    }
}
