package com.lcq.designpatterns.action.strategy;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/20 13:53
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 选择并创建需要使用的策略对象
        MemberStrategy strategy = new AdvancedMemberStrategy();
        // 创建环境
        Price price = new Price(strategy);
        // 计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
