package com.lcq.designpatterns.structure.proxy;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 16:55
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}
