package com.jmacgyve.chapter2.problem1;

import com.jmacgyve.chapter2.problem1.interfaces.MessageProvider;
import com.jmacgyve.chapter2.problem1.interfaces.MessageRenderer;

public class Main {
    //Классический пример DI
    public static void main(String[] args) {
        MessageRenderer messageRenderer = new StandardOurMessageRender();
        MessageProvider messageProvider = new HelloWorldMessageProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
