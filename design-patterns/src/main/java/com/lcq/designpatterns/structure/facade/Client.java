package com.lcq.designpatterns.structure.facade;

/**
 * @ClassName: Client
 * @Description: 在StandardWrapperValue类总并没有直接将Request对象传递给ApplicationFilterChain类的doFilter方法，
 * 传递的是RequestFacade与ResponseFacade对象，为什么这么说呢，看一下request.getRequest()与response.getResponse()就真相大白了。
 * @Author: lichaoqian
 * @Date: 2020/8/21 15:39
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
