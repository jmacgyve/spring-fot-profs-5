package com.jmacgyve.chapter4.messagePublishing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public MessagePublisher publisher() {
        return new MessagePublisher();
    }

    @Bean
    public MessageEventListener messageEventListener() {
        return new MessageEventListener();
    }
}
