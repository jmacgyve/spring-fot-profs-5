package com.jmacgyve.chapter4.init;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.PostConstruct;

public class SingerWithAnnotation {
    private final static String defaultName = "DEFAULT NAME";
    private String name;
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @PostConstruct
    public void init2() {
        System.out.println("Инициализация бина с аннотацией PostConstruct");

        if (name == null) name = defaultName;

        if (age == Integer.MIN_VALUE) throw new IllegalArgumentException("Задайте значение age");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/chapter4-app-context.xml");
        ctx.refresh();

        getBean("singer1", ctx);
        getBean("singer2", ctx);
        getBean("singer3", ctx);

        ctx.close();
    }

    private static SingerWithAnnotation getBean(String singer1, GenericXmlApplicationContext ctx) {
        try {
            SingerWithAnnotation bean = (SingerWithAnnotation) ctx.getBean(singer1);
            System.out.println(bean);
            return bean;
        } catch (Exception e) {
            System.out.println("не удалось получить бин " + e.getMessage());
            return null;
        }
    }
}
