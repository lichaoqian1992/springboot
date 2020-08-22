package com.lcq.designpatterns.structure.facade;

/**
 * @ClassName: Facade
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/21 15:38
 * @Version: 1.0
 **/
public class Facade {

    public void test() {
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}
