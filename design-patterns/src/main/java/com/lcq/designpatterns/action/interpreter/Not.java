package com.lcq.designpatterns.action.interpreter;

/**
 * @ClassName: Not
 * @Description: 代表逻辑“非”操作的Not类，代表由一个布尔表达式通过逻辑“非”操作给出一个新的布尔表达式的操作。
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:22
 * @Version: 1.0
 **/
public class Not extends Expression{

    private Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }
    @Override
    public boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Not) {
            return exp.equals(((Not) obj).exp);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(Not " + exp.toString() + ")";
    }
}
