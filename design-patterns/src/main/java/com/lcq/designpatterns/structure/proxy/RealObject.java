package com.lcq.designpatterns.structure.proxy;

/**
 * @ClassName: RealObject
 * @Description: 目标对象角色
 * @Author: lichaoqian
 * @Date: 2020/8/20 16:53
 * @Version: 1.0
 **/
public class RealObject extends AbstractObject{
    @Override
    public void operation() {
        // 一些操作
        System.out.println("一些操作");
    }
}
