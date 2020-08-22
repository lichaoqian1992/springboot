package com.lcq.designpatterns.action.visitor;

/**
 * @ClassName: SubEast1
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 15:20
 * @Version: 1.0
 **/
public class SubEast1 extends East {
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }

    public String myName1() {
        return "SubEast1";
    }
}
