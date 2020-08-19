package com.lcq.designpatterns.creational.prototype;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 14:48
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape :" + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape :" + clonedShape2.getType());
    }
}
