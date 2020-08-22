package com.lcq.designpatterns.structure.decorator;

/**
 * @ClassName: Change
 * @Description: 抽象装饰角色“七十二变”
 * @Author: lichaoqian
 * @Date: 2020/8/20 17:13
 * @Version: 1.0
 **/
public class Change implements TheGreatestSage {

    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        // 代码
        sage.move();
    }
}
