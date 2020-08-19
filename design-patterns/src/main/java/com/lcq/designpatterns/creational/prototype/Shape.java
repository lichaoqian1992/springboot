package com.lcq.designpatterns.creational.prototype;


/**
 * @ClassName: Builder
 * @Description: 建造者
 * @Author: lichaoqian
 * @Date: 2020/8/19 11:47
 * @Version: 1.0
 **/
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
