package com.lcq.designpatterns.action.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Context
 * @Description: 环境（Context）类定义出从变量到布尔值的一个映射
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:12
 * @Version: 1.0
 **/
public class Context {

    private Map<Variable, Boolean> map = new HashMap<>();

    public void assign(Variable var, boolean value) {
        map.put(var, value);
    }

    public boolean lookup(Variable var) {
        Boolean value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value;
    }
}
