package com.lcq.designpatterns.structure.bridge;

/**
 * @ClassName: MessageSMS
 * @Description: 系统内短消息实现类
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:19
 * @Version: 1.0
 **/
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用系统内短消息的方法，发送消息'" + message + "'给" + toUser);
    }
}
