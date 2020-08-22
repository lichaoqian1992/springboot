package com.lcq.designpatterns.action.strategy;

/**
 * @ClassName: IntermediateMemberStrategy
 * @Description: 中级会员折扣类
 * @Author: lichaoqian
 * @Date: 2020/8/20 13:49
 * @Version: 1.0
 **/
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
