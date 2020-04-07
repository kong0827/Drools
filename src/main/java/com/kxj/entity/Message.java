package com.kxj.entity;
import lombok.*;

/**
 * @ClassName Message
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2020/4/7 14:23
 * @Version 1.0
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {


    public enum MessageType {
        /**
         * 嗨
         */
        HI,
        /**
         * 再见
         */
        GOODBYE,
        /**
         * 聊天
         */
        CHAT
    }

    private MessageType messageType;
    private String target;

}
