package com.lcq.designpatterns.structure.bridge;

/**
 * @ClassName: MessageImplementor
 * @Description: 实现发送消息的统一接口
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:11
 * @Version: 1.0
 **/
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message 要发送的内容
     * @param toUser 消息的接收者
     */
    void send(String message, String toUser);
}
