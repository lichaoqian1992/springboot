package com.lcq.designpatterns.structure.composite;

/**
 * @ClassName: Leaf
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/21 15:13
 * @Version: 1.0
 **/
public class Leaf extends Component {

    /**
     * 叶子对象的名字
     */
    private String name;

    /**
     * 构造方法,传入叶子对象的名称
     * @param name
     */
    public Leaf(String name) {
        this.name = name;
    }

    /**
     * 输出叶子对象的结构,叶子对象没有子对象,也就是输出叶子对象的名字
     * @param preStr
     */
    @Override
    public void pringStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
