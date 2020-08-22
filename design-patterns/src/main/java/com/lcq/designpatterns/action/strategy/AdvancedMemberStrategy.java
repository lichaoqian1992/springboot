package com.lcq.designpatterns.action.strategy;

/**
 * @ClassName: AdvancedMemberStrategy
 * @Description: 高级会员折扣类
 * @Author: lichaoqian
 * @Date: 2020/8/20 13:50
 * @Version: 1.0
 **/
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
