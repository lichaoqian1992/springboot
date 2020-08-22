package com.lcq.designpatterns.structure.composite;

/**
 * @ClassName: Client
 * @Description: 文件结构就是典型的组合模式
 * @Author: lichaoqian
 * @Date: 2020/8/21 15:15
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");

        Component leaf1 = new Leaf("衬衫");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        root.pringStruct("");
    }
}
