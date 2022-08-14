package com.jmacgyve.chapter3.annotations;

import com.jmacgyve.chapter2.problem1.interfaces.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    @Autowired
    public ConfigurableMessageProvider(String message2) {
        this.message = message2;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

