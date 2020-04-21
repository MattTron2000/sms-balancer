package com.hamicorp.smsbalancer.application;

import com.hamicorp.smsbalancer.domain.Message;
import com.hamicorp.smsbalancer.domain.MessageId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageRepository messageRepository;

    MessageController(MessageRepository messageRepository) {

        this.messageRepository = messageRepository;
    }

    @RequestMapping(value = "/messages", method = RequestMethod.PUT)
    public String sendMessage() {
        return "Message send not implemented";
    }

    @RequestMapping(value = "/messages/{id}", method = RequestMethod.GET)
    public String getMessage(@PathVariable String id) {
        MessageId messageId = MessageId.from(id);
        Message message = messageRepository.retrieve(messageId);
        return "Message receive not implemented";
    }
}
