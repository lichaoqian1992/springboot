package com.lcq.designpatterns.structure.decorator;

/**
 * @ClassName: Bird
 * @Description: 具体装饰角色“鸟儿”
 * @Author: lichaoqian
 * @Date: 2020/8/20 17:15
 * @Version: 1.0
 **/
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }
    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }
}
