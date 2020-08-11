package com.lcq.designpatterns.creational.singleton;

/**
 * @ClassName: SingletonPattern
 * @Description: 无锁线程安全单例模式
 * @Author: lichaoqian
 * @Date: 2020/8/11 20:05
 * @Version: 1.0
 **/
public class SingletonLockFree {

    private static final SingletonLockFree singleton = new SingletonLockFree();

    private SingletonLockFree() {

    }

    public static synchronized SingletonLockFree getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(
                    () ->
                        System.out.println(Thread.currentThread().getName()+" : "+ SingletonLockFree.getInstance().hashCode())
            ).start();
        }
    }

}
