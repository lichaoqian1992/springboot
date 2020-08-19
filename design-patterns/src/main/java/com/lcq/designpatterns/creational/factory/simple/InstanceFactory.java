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

    private static Map<String, Object> map;

    static {
        map = new HashMap<>();
        map.put("bike", Bike.class);
        map.put("car", Car.class);
        map.put("truck", Truck.class);
    }

    public static Vehicle createVehicle(String type) {
        Vehicle vehicle = null;
        if (new Truck() instanceof  Vehicle) {

        }
        if (map != null && map.get(type) instanceof Vehicle) {
            return ((Vehicle) map.get(type)).newInstance();
        }
        return vehicle;
    }

    public static void main(String[] args) {
        createVehicle("bike");
    }
}
