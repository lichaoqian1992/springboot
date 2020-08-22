package com.lcq.designpatterns.structure.bridge;

/**
 * @ClassName: Client
 * @Description: 桥梁模式在Java应用中的一个非常典型的例子就是JDBC驱动器
 * @Author: lichaoqian
 * @Date: 2020/8/21 9:22
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 创建具体的实现对象
        MessageImplementor impl = new MessageSMS();
        // 创建普通消息对象
        AbstractMessage message = new CommMessage(impl);
        message.sendMessage("加班申请速批", "李总");

        // 将实现方式切换成邮件，再次发送
        impl = new MessageEmail();
        // 创建加急消息对象
        message = new UrgencyMessage(impl);
        message.sendMessage("加班申请速批", "李总");
    }
}
