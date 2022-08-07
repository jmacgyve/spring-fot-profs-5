package com.jmacgyve.chapter2.problem1;

import com.jmacgyve.chapter2.problem1.interfaces.MessageProvider;
import com.jmacgyve.chapter2.problem1.interfaces.MessageRenderer;

public class StandardOurMessageRender implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("Установите свойство messageProvider в данном классе " + StandardOurMessageRender.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
