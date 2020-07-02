package com.zjy.springclou.controller;

import com.zjy.springclou.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: com.zjy.springcloud
 * @description: SendMessage
 * @author: Zjy
 * @create: 2020-07-01 11:27
 **/
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessag")
    public String sendMessage(){
        return messageProvider.send();
    }
}
