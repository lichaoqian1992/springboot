package com.lcq.designpatterns.action.strategy;

/**
 * @ClassName: PrimaryMemberStrategy
 * @Description: 初级会员折扣类
 * @Author: lichaoqian
 * @Date: 2020/8/20 13:49
 * @Version: 1.0
 **/
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初始会员没有折扣");
        return booksPrice;
    }
}
