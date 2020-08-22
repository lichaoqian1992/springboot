package com.lcq.designpatterns.action.visitor;

/**
 * @ClassName: SubWest2
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 15:18
 * @Version: 1.0
 **/
public class SubWest2 extends West {
    @Override
    public void goWest1(SubEast1 east) {
        System.out.println("SubWest2 + " + east.myName1());
    }

    @Override
    public void goWest2(SubEast2 east) {
        System.out.println("SubWest2 + " + east.myName2());
    }
}
