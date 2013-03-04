package com.chatApp.wehelpsu.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.chatApp.wehelpsu.client.ChatMsgService;
import com.chatApp.wehelpsu.shared.MessageBean;

import java.util.ArrayList;
import java.util.List;


public class ChatMsgServiceImpl extends RemoteServiceServlet implements ChatMsgService {
    private List<MessageBean> messages = new ArrayList<MessageBean>();

    @Override
    public MessageBean[] getMessages() {
        return messages.toArray(new MessageBean[messages.size()]);
    }

    @Override
    public MessageBean[] addMessage(final MessageBean msg) {
        messages.add(msg);
        return messages.toArray(new MessageBean[messages.size()]);
    }
}
