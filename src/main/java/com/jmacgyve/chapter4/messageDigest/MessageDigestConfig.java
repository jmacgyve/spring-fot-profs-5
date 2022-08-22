package com.jmacgyve.chapter4.messageDigest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageDigestConfig {

    @Bean
    public MessageDigestFactoryBean sha() {
        MessageDigestFactoryBean factorySha = new MessageDigestFactoryBean();
        factorySha.setAlgorithmName("SHA1");
        return factorySha;
    }

    @Bean
    public MessageDigestFactoryBean defaultMode(){
        return new MessageDigestFactoryBean();
    }

    @Bean
    public MessageDigester digester() throws Exception {
        MessageDigester messageDigester = new MessageDigester();
        messageDigester.setDigest1(sha().getObject());
        messageDigester.setDigest2(defaultMode().getObject());
        return messageDigester;
    }
}
