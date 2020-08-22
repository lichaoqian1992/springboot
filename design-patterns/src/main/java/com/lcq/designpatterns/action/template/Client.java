package com.lcq.designpatterns.action.template;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 14:13
 * @Version: 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }
}
