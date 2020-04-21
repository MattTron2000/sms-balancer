package com.hamicorp.smsbalancer.domain;

import java.util.UUID;

public class MessageId {
    private final UUID id;

    MessageId(UUID id) {
        this.id = id;
    }

    public static MessageId generate() {
        return new MessageId(UUID.randomUUID());
    }

    public static MessageId from(String id) {
        UUID uuid = UUID.fromString(id);
        return new MessageId(uuid);
    }
}
