package com.jmacgyve.chapter2.problem1;

import com.jmacgyve.chapter2.problem1.interfaces.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
