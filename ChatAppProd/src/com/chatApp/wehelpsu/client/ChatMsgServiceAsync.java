package com.chatApp.wehelpsu.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.chatApp.wehelpsu.shared.MessageBean;


public interface ChatMsgServiceAsync {
    void getMessages(AsyncCallback<MessageBean[]> callback);
    void addMessage(MessageBean msg, AsyncCallback<MessageBean[]> callback);
}
