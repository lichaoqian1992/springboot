package com.lcq.designpatterns.structure.adapter;

/**
 * @ClassName: ObjAdapter
 * @Description: 对象适配器
 * @Author: lichaoqian
 * @Date: 2020/8/20 16:44
 * @Version: 1.0
 **/
public class ObjAdapter {

    private Adapee adapee;
    public ObjAdapter(Adapee adapee) {
        this.adapee = adapee;
    }

    /**
     * 源类Adapter有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOpeartion1() {
        this.adapee.sampleOpeartion1();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类补充此方法
     */
    public void sampleOpeartion2() {
        // 写相关的代码
        System.out.println("新增的方法");
    }
}
