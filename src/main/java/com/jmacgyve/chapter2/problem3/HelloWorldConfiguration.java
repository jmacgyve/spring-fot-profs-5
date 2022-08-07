package com.jmacgyve.chapter2.problem3;

import com.jmacgyve.chapter2.problem1.HelloWorldMessageProvider;
import com.jmacgyve.chapter2.problem1.interfaces.MessageProvider;
import com.jmacgyve.chapter2.problem1.interfaces.MessageRenderer;
import com.jmacgyve.chapter2.problem1.StandardOurMessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOurMessageRender();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
