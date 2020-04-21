package com.hamicorp.smsbalancer.domain;

import java.util.Optional;

public class Message {

    private final Optional<MessageId> id;
    private final String body;
    private final String recipientPhoneNumber;
    private final MessageStatus status;

    public Message(String body, String recipientPhoneNumber) {
        this.id = Optional.empty();
        this.body = body;
        this.recipientPhoneNumber = recipientPhoneNumber;
        status = MessageStatus.PENDING;
    }

    public Message(MessageId id, String body, String recipientPhoneNumber, MessageStatus status) {
        this.id = Optional.of(id);
        this.body = body;
        this.recipientPhoneNumber = recipientPhoneNumber;
        this.status = status;
    }
}
