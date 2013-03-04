package com.chatApp.wehelpsu.client;

import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;


public class ChatLogin implements Content {

    public static final String COOKIE_NAME = "CHAT_NAME";

    private HorizontalPanel panel = new HorizontalPanel();
    private TextBox nameTextBox = new TextBox();
    private Button loginButton = new Button();

    @Override
    public Widget getContent() {
        loginButton.setText("Login");

        loginButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(final ClickEvent event) {
                login();
            }
        });

        nameTextBox.addKeyPressHandler(new KeyPressHandler() {
            @Override
            public void onKeyPress(final KeyPressEvent event) {
                if (event.getCharCode() == KeyCodes.KEY_ENTER) {
                    login();
                }
            }
        });

        panel.add(nameTextBox);
        panel.add(loginButton);

        return panel;
    }

    private void login() {
        final String name = nameTextBox.getText();
        if(name.equals("")||name=="")
        	Window.alert("Enter a name");

        if (name.length() > 0) {
            Cookies.setCookie(COOKIE_NAME, nameTextBox.getText());
            ContentContainer.setContent(new ChatBox());
        }
    }
}
