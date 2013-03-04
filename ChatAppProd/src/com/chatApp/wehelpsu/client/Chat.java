package com.chatApp.wehelpsu.client;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Chat implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get("appTitle").add(new Label("Welcome to group chat"));
        ContentContainer.setContent(new ChatLogin());
    }
}