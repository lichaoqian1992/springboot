package com.lcq.designpatterns.action.template;

/**
 * @ClassName: MoneyMarketAccount
 * @Description: 具体模板角色类
 * @Author: lichaoqian
 * @Date: 2020/8/20 14:12
 * @Version: 1.0
 **/
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
