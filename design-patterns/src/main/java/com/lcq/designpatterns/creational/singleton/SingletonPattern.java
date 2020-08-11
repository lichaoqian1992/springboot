package com.lcq.designpatterns.creational.singleton;

/**
 * @ClassName: SingletonPattern
 * @Description: 单例模式
 * @Author: lichaoqian
 * @Date: 2020/8/11 20:05
 * @Version: 1.0
 **/
public class SingletonPattern {

    private static SingletonPattern singletonInstance;

    private SingletonPattern() {

    }

    public static SingletonPattern getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonPattern();
        }
        return singletonInstance;
    }

    public void doSomeThing() {
        System.out.println("Something is Done;");
    }

    public static void main(String[] args) {
        SingletonPattern.getInstance().doSomeThing();
    }

}
