package com.jmacgyve.chapter4.messagePublishing;

import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent event) {
        System.out.println("Получено сообщение: " + event.getMessage());
    }
}
