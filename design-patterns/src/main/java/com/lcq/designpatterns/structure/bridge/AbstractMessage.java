package com.lcq.designpatterns.structure.bridge;

/**
 * @ClassName: AbstractMessage
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:10
 * @Version: 1.0
 **/
public abstract class AbstractMessage {

    // 持有一个实现部分的对象
    private MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     * @param impl 实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，委托给实现部分的方法
     * @param message 要发送消息的内容
     * @param toUser 消息的接收者
     */
    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}
