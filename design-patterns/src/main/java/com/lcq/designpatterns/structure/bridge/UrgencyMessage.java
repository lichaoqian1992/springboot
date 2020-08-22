package com.lcq.designpatterns.structure.bridge;

/**
 * @ClassName: UrgencyMessage
 * @Description: 加急消息
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:16
 * @Version: 1.0
 **/
public class UrgencyMessage extends AbstractMessage {
    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展自己的功能，监控某消息的处理状态
     * @param messageId
     * @return
     */
    public Object watch(String messageId) {
        // 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
        return null;
    }
}
