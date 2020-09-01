package com.lcq.designpatterns.creational.singleton;

import java.util.Arrays;
import java.util.Calendar;

/**
 * @ClassName: SingletonStatic
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/22 15:23
 * @Version: 1.0
 **/
public class SingletonStatic {

    public static class SingletonFactory {
        private static SingletonStatic instance = new SingletonStatic();
    }

    public SingletonStatic getInstance() {
        return SingletonFactory.instance;
    }

    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder();
    sb.append("11").append("1");
        Calendar calendar = Calendar.getInstance();
        Runtime.getRuntime();
        Arrays.asList(1);
    }
}
