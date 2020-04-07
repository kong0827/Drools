package com.kxj.controller;/**
 * @author xiangjin.kong
 * @date 2020/4/7 14:59
 * @desc
 */

import com.kxj.entity.Message;
import com.kxj.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MessageController
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2020/4/7 14:59
 * @Version 1.0
 **/
@RestController
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message")
    public void getMessage() {
        Message message = new Message(Message.MessageType.HI, "杨过");
        Message serviceMessage = messageService.getMessage(message);
        System.out.println(serviceMessage);

    }
}
