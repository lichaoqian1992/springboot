package com.lcq.designpatterns.structure.composite;

import java.util.List;

/**
 * @ClassName: Component
 * @Description: 抽象构件角色类
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:47
 * @Version: 1.0
 **/
public abstract class Component {
    /**
     * 输出组建自身的名称
     * @param preStr
     */
    public abstract void pringStruct(String preStr);

    /**
     * 聚集管理方法，增加一个子构件对象
     * @param child
     */
    public void addChild(Component child) {
        /**
         * 缺省实现，抛出异常，因为叶对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    /**
     * 聚集管理方法，删除一个自构建对象
     */
    public void removeChild(int index) {
        /**
         * 缺省实现，抛出异常，因为叶对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw  new UnsupportedOperationException("对象不支持此功能");
    }

    public List<Component> getChild() {
        /**
         * 缺省实现，抛出异常，因为叶对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
