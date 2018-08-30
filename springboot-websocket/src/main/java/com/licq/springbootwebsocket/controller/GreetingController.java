package com.licq.springbootwebsocket.controller;

import com.licq.springbootwebsocket.entity.Greeting;
import com.licq.springbootwebsocket.entity.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception{
        System.out.println("message:"+message);
        Thread.sleep(1000);
        return new Greeting("Hello," + message.getName() + "!");
    }

    @MessageMapping("/message")
//    @SendTo("/topic/greetings")
    //接收/app/message发来的value，然后将value转发到/topic/greetings客户端
    public Greeting message(String message) throws  Exception {
        //通过convertAndSendToUser 向用户发送信息,
        // 第一个参数是接收消息的用户,第二个参数是浏览器订阅的地址,第三个参数是消息本身
        //messagingTemplate.convertAndSendToUser();
        System.out.println("发送的消息是："+message);
        messagingTemplate.convertAndSend("/topic/greetings", new Greeting("abc"));
        return null;
    }

    /**
     * 说明：
     * 1. @MessageMapping注解不是@RequestMapping，后者是我们熟悉的用于http请求的映射，前者是基于webSocket协议的请求。但是理解都很简单。
     * 2. SimpMessagingTemplate
     * SimpMessagingTemplate是Spring-WebSocket内置(就是封装起来的和SDR差不多，很方便)的一个消息发送工具，可以将消息发送到指定的客户端。
     * 3. @SendTo这个注解就是将信息分发到订阅者 ，和messagingTemplate.convertAndSend()等价。
     */
}
