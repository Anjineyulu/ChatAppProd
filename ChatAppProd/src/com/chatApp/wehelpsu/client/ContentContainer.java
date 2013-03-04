package com.chatApp.wehelpsu.client;
import com.google.gwt.user.client.ui.RootPanel;


public final class ContentContainer {
    private ContentContainer() {
    }

    public static void setContent(final Content content) {
        final RootPanel root = RootPanel.get("container");
        root.clear();
        root.add(content.getContent());
    }
}
