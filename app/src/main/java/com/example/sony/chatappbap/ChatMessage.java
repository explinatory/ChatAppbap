package com.example.sony.chatappbap;

import java.util.Date;

/**
 * Created by opilane on 16.11.2017.
 */

public class ChatMessage
{
    private String messageText;
    private String messageUser;
    private long messageTime;

    public ChatMessage(String messageText, String messageUser, long messageTime) {
        this.messageText = messageText;
        messageUser = messageUser;
        this.messageTime = messageTime;

        messageTime = new Date().getTime();
    }
    public ChatMessage(String s, String email){}

    public String getMessageText() {
        return messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
