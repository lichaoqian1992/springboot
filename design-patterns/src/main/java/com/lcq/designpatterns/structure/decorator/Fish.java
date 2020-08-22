package com.lcq.designpatterns.structure.decorator;

/**
 * @ClassName: Fish
 * @Description: 具体装饰角色“鱼儿”
 * @Author: lichaoqian
 * @Date: 2020/8/20 17:14
 * @Version: 1.0
 **/
public class Fish extends Change {

    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Fish Move");
    }
}
