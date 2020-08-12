package com.lcq.designpatterns.creational.factory.simple;

import com.lcq.designpatterns.entity.Bike;
import com.lcq.designpatterns.entity.Car;
import com.lcq.designpatterns.entity.Truck;
import com.lcq.designpatterns.entity.Vehicle;

/**
 * @ClassName: StaticFactory
 * @Description: 静态工厂模式
 * @Author: lichaoqian
 * @Date: 2020/8/12 18:47
 * @Version: 1.0
 **/
public class StaticFactory {

    /**
     * 枚举
     */
    public enum VehicleType {
        Bike, Car, Truck
    }

    /**
     * 静态工厂模式
     * @param type
     * @return
     */
    public static Vehicle create(VehicleType type) {
        if (type.equals(VehicleType.Bike)) {
            return new Bike();
        }
        if (type.equals(VehicleType.Car)) {
            return new Car();
        }
        if (type.equals(VehicleType.Truck)) {
            return new Truck();
        }
        return null;
    }



    public static void main(String[] args) {
        create(VehicleType.Bike);
    }
}
