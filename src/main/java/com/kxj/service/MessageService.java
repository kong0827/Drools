package com.kxj.service;/**
 * @author xiangjin.kong
 * @date 2020/4/7 14:39
 * @desc
 */

import com.kxj.entity.Message;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName MessageService
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2020/4/7 14:39
 * @Version 1.0
 **/
@Service
public class MessageService {

    private final KieContainer kieContainer;

    @Autowired
    public MessageService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Message getMessage(Message message) {
        KieSession kieSession = kieContainer.newKieSession("messageSession");
        kieSession.insert(message);
        kieSession.fireAllRules();
        kieSession.dispose();
        return message;
    }
}
