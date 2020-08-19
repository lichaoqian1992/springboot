package com.lcq.designpatterns.action.iterator;

/**
 * @ClassName: ConcreteAggregate
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/19 16:54
 * @Version: 1.0
 **/
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    /**
     * 构造方法，传入聚合对象的具体内容
     * @return
     */
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index) {
        if (index < objArray.length) {
            return objArray[index];
        } else {
            return null;
        }
    }

    public int size() {
        return objArray.length;
    }
}
