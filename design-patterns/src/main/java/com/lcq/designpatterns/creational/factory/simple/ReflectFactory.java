package com.lcq.designpatterns.creational.factory.simple;

import com.lcq.designpatterns.entity.Vehicle;
import com.lcq.designpatterns.enums.VehicleEnum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ReflectFactory
 * @Description: 使用反射机制进行类注册的简单工厂模式
 * @Author: lichaoqian
 * @Date: 2020/8/12 19:15
 * @Version: 1.0
 **/
public class ReflectFactory {

    public static Vehicle createVehicle(String type) {
        Object obj = getInstanceByQualifiedName(type);
        Vehicle vehicle = null;
        if (obj != null && obj instanceof Vehicle) {
            vehicle = (Vehicle) obj;
        }
        return vehicle;
    }

    private static Object getInstanceByQualifiedName(String type) {
        Object instance = null;
        // 从枚举党中根据code获取对应实现类的完成路径
        String className = VehicleEnum.getClassNameByType(type);
        // 根据类完成路径利用反射获取默认的构造器，利用构造器的newInstance获取对象实例
        try {
            Constructor<?> constructor = Class.forName(className).getDeclaredConstructor();
            instance = constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        ReflectFactory reflectFactory = new ReflectFactory();
        createVehicle("bike");
    }
}
