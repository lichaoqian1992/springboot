package com.lcq.designpatterns.creational.singleton;

/**
 * @ClassName: SingletonPattern
 * @Description: 双重锁实现单例模式
 * @Author: lichaoqian
 * @Date: 2020/8/11 20:05
 * @Version: 1.0
 **/
public class SingletonLock {

    private static volatile SingletonLock singleton = null;

    private SingletonLock() {

    }

    public static SingletonLock getInstance() {
        //第一次校验singleton是否为空
        if (singleton == null) {
            synchronized (SingletonLock.class) {
                //第二次校验singleton是否为空
                if (singleton == null) {
                    singleton = new SingletonLock();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    () ->
                        System.out.println(Thread.currentThread().getName()+" : "+ SingletonLock.getInstance().hashCode())
            ).start();
        }
    }

}
