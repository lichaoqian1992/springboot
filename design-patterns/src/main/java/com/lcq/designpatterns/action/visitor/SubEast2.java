package com.lcq.designpatterns.action.visitor;

/**
 * @ClassName: SubEast2
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 15:21
 * @Version: 1.0
 **/
public class SubEast2 extends East {
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }

    public String myName2() {
        return "SubEast2";
    }
}
