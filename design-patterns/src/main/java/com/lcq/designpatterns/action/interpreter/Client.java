package com.lcq.designpatterns.action.interpreter;

/**
 * @ClassName: Client
 * @Description: 解释器模式客户端
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:27
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");

        Constant c = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);
        Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
        System.out.println("x="+ x.interpret(ctx));
        System.out.println("y="+ y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
    }
}
