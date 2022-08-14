package com.jmacgyve.chapter3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusion {

    private String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    public ConstructorConfusion(int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-context-xml.xml");
        ctx.refresh();

        ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(cc); //ConstructorConfusion(String) called 90

        ConfigurableMessageProvider cmp = (ConfigurableMessageProvider) ctx.getBean("provider");
        System.out.println(cmp.getMessage()); //I hope that someone gets my message in a bottle

        ctx.close();
    }

    public String toString() {
        return someValue;
    }
}
