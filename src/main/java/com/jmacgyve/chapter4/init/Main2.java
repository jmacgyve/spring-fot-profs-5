package com.jmacgyve.chapter4.init;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/chapter4-app-context-interface.xml");
        ctx.refresh();

        getBean("singer1", ctx);
        getBean("singer2", ctx);
        getBean("singer3", ctx);

        ctx.close();
    }

    private static Singer getBean(String singer1, GenericXmlApplicationContext ctx) {
        try {
            Singer bean = (Singer) ctx.getBean(singer1);
            System.out.println(bean);
            return bean;
        } catch (Exception e) {
            System.out.println("не удалось получить бин " + e.getMessage());
            return null;
        }
    }
}
