package com.lcq.designpatterns.action.strategy;

/**
 * @ClassName: Price
 * @Description: 价格类
 * @Author: lichaoqian
 * @Date: 2020/8/20 13:51
 * @Version: 1.0
 **/
public class Price {

    // 持有一个具体的策略对象
    private MemberStrategy strategy;

    /**
     * 构造函数，传入一个具体的策略对象
     * @param strategy
     */
    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double quote(double booksPrice) {
        return this.strategy.calcPrice(booksPrice);
    }
}
