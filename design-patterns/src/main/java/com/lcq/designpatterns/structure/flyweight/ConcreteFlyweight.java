package com.lcq.designpatterns.structure.flyweight;

import lombok.AllArgsConstructor;

/**
 * @ClassName: ConcreteFlyweight
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/21 15:55
 * @Version: 1.0
 **/
@AllArgsConstructor
public class ConcreteFlyweight implements Flyweight {

    private Character intrinsicState;

    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
