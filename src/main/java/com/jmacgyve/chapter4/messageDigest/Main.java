package com.jmacgyve.chapter4.messageDigest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(MessageDigestConfig.class);
        MessageDigester messageDigester = (MessageDigester) ctx.getBean("digester");
        messageDigester.digest("check");

        ctx.close();
    }
}
