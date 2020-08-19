package com.lcq.designpatterns.action.interpreter;

/**
 * @ClassName: Variable
 * @Description: 一个Variable对象代表一个有名变量
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:17
 * @Version: 1.0
 **/
public class Variable extends Expression {

    private String name;
    public Variable(String name) {
        this.name = name;
    }
    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Variable) {
            return this.name.equals(((Variable) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
