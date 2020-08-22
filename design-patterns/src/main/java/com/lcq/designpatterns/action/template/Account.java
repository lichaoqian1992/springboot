package com.lcq.designpatterns.action.template;

/**
 * @ClassName: Account
 * @Description: 抽象模板角色类
 * @Author: lichaoqian
 * @Date: 2020/8/20 14:07
 * @Version: 1.0
 **/
public abstract class Account {

    /**
     * 模板方法，计算利息数额
     * @return 返回利息数额
     */
    public final double calculateInterest() {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount * interestRate;
    }

    /**
     * 基本方法留给字类实现
     * @return
     */
    protected abstract String doCalculateAccountType();

    /**
     * 基本方法留给字类实现
     * @return
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 基本方法，已经实现
     * @param accountType
     * @return
     */
    private double calculateAmount(String accountType) {
        /**
         * 省略相关的业务逻辑
         */
        return 7243.00;
    }
}
