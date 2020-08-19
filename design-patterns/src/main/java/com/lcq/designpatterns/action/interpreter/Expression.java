package com.lcq.designpatterns.action.interpreter;

/**
 * @ClassName: Expression
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:11
 * @Version: 1.0
 **/
public abstract class Expression {

    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     * @param ctx
     * @return
     */
    public abstract boolean interpret(Context ctx);

    /**
     * 检验两个表达式在结构上是否相同
     * @param obj
     * @return
     */
    public abstract boolean equals(Object obj);

    /**
     * 返回表达式的hashcode
     * @return
     */
    public abstract int hashCode();

    /**
     * 将表达式转换成字符串
     * @return
     */
    public abstract String toString();
}
