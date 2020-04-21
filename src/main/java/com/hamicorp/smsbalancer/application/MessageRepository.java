package com.hamicorp.smsbalancer.application;

import com.hamicorp.smsbalancer.domain.Message;
import com.hamicorp.smsbalancer.domain.MessageId;
import org.springframework.stereotype.Component;

@Component
public class MessageRepository {

    public void save(Message message) {

    }

    public Message retrieve(MessageId id) {
        return null;
    }
}
