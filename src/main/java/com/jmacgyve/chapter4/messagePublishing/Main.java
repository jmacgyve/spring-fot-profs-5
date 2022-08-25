package com.jmacgyve.chapter4.messagePublishing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MessagePublisher mp = (MessagePublisher) context.getBean("publisher");

        mp.publish("Сообщение 1");
        mp.publish("Сообщение 2");
        mp.publish("Сообщение 3");
    }
}
