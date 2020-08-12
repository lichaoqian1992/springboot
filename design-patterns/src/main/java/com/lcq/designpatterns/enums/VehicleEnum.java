package com.lcq.designpatterns.enums;

import com.lcq.designpatterns.entity.Bike;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: VehicleEnum
 * @Description: 汽车枚举类
 * @Author: lichaoqian
 * @Date: 2020/8/12 19:36
 * @Version: 1.0
 **/
public enum VehicleEnum {

    BIKE("bike", "com.lcq.designpatterns.entity.Bike"),
    CAR("car", "com.lcq.designpatterns.entity.Car"),
    TRUCK("mail", "com.lcq.designpatterns.entity.Truck");

    @Getter
    private String code;

    @Getter
    private String className;

    private static Map<String, String> map;

    static {
        map = new HashMap<>();
        map.put(BIKE.getCode(), BIKE.getClassName());
        map.put(CAR.getCode(), CAR.getClassName());
        map.put(TRUCK.getCode(), TRUCK.getClassName());
    }

    VehicleEnum(String code, String className) {
        this.code = code;
        this.className = className;
    }

    public static String getClassNameByType(String type) {
        return map.get(type);
    }

}
