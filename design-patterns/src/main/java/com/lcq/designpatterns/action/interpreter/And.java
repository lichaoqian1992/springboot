package com.lcq.designpatterns.action.interpreter;

/**
 * @ClassName: And
 * @Description: 代表逻辑“与”操作的And类，表示由两个布尔表达式通过逻辑“与”给出一个新的布尔表达式的操作
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:22
 * @Version: 1.0
 **/
public class And extends Expression{

    private Expression left, right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) && right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof And) {
            return left.equals(((And) obj).left) && right.equals(((And) obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }
}
