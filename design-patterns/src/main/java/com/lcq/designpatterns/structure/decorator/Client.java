package com.lcq.designpatterns.structure.decorator;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 17:16
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);

        // 第二种写法
//        TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }
}
