package com.lcq.designpatterns.action.strategy;

/**
 * @ClassName: MemberStrategy
 * @Description: 抽象折扣类
 * @Author: lichaoqian
 * @Date: 2020/8/20 13:47
 * @Version: 1.0
 **/
public interface MemberStrategy {

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    double calcPrice(double booksPrice);
}
