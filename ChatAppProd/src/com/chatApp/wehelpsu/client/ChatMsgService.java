package com.chatApp.wehelpsu.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.chatApp.wehelpsu.shared.MessageBean;


@RemoteServiceRelativePath("messages")
public interface ChatMsgService extends RemoteService {
    MessageBean[] getMessages();
    MessageBean[] addMessage(MessageBean msg);
}
