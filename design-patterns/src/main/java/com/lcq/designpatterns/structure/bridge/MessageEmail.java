package com.lcq.designpatterns.structure.bridge;

/**
 * @ClassName: MessageEmail
 * @Description: 邮件短消息实现类
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:21
 * @Version: 1.0
 **/
public class MessageEmail implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件短消息的方法，发送消息’" + message + "'给" + toUser);
    }
}
