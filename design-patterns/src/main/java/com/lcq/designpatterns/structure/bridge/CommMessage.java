package com.lcq.designpatterns.structure.bridge;

/**
 * @ClassName: CommMessag
 * @Description: 普通消息
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:14
 * @Version: 1.0
 **/
public class CommMessage extends AbstractMessage {

    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public CommMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 对于普通消息，直接调用父类方法，发送消息即可
        super.sendMessage(message, toUser);
    }
}
