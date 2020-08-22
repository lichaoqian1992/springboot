package com.lcq.designpatterns.structure.decorator;

/**
 * @ClassName: Monkey
 * @Description: 具体构件角色“大圣本尊”猢狲类
 * @Author: lichaoqian
 * @Date: 2020/8/20 17:13
 * @Version: 1.0
 **/
public class Monkey implements TheGreatestSage {
    @Override
    public void move() {
        // 代码
        System.out.println("Monkey Move");
    }
}
