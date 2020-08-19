package com.lcq.designpatterns.action.interpreter;

/**
 * @ClassName: Constant
 * @Description: 一个Constant对象代表一个布尔常量
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:15
 * @Version: 1.0
 **/
public class Constant extends Expression{

    private boolean value;
    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Constant) {
            return this.value == ((Constant) obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
