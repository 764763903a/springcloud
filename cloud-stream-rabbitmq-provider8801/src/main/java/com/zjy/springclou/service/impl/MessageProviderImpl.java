package com.zjy.springclou.service.impl;

import com.zjy.springclou.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.UUID;

/**
 * @program: com.zjy.springcloud
 * @description: Impl
 * @author: Zjy
 * @create: 2020-07-01 11:19
 **/
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial"+serial);
        return null;
    }
}
