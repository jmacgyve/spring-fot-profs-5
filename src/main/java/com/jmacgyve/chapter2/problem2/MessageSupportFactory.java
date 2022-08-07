package com.jmacgyve.chapter2.problem2;

import com.jmacgyve.chapter2.problem1.interfaces.MessageProvider;
import com.jmacgyve.chapter2.problem1.interfaces.MessageRenderer;

import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    static {
        instance = new MessageSupportFactory();
    }

    public MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(this.getClass().getResourceAsStream("/msf.properties"));
            String renderClass = props.getProperty("render.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(renderClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();

        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }

    public MessageProvider getProvider() {
        return provider;
    }
}
