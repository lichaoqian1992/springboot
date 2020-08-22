package com.lcq.designpatterns.action.template;

/**
 * @ClassName: CDAccount
 * @Description: 具体模板角色类
 * @Author: lichaoqian
 * @Date: 2020/8/20 14:13
 * @Version: 1.0
 **/
public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
