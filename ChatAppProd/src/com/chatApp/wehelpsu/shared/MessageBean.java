package com.chatApp.wehelpsu.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class MessageBean implements IsSerializable {
    private String user;
    private String message;

    private MessageBean() {
    }

    public MessageBean(final String user, final String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}