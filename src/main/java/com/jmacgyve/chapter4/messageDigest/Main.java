package com.jmacgyve.chapter4.messageDigest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MessageDigestConfig.class);
        MessageDigester messageDigester = (MessageDigester) ctx.getBean("digester");
        messageDigester.digest("check");
    }
}

/**

 afterPropertiesSet === SHA1
 afterPropertiesSet === MD5
 digest1
 Использую алгоритм --- SHA1
 [B@2ddc9a9f
 digest2
 Использую алгоритм --- MD5
 [B@298a5e20

 */
