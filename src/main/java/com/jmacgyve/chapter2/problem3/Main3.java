package com.jmacgyve.chapter2.problem3;

import com.jmacgyve.chapter2.problem1.interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    //Spring Core Module
    public static void main(String[] args) {
        //Пример DI через XML
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageRenderer mr1 = ctx.getBean("renderer", MessageRenderer.class);
        mr1.render();

        //Пример DI через Annotations
        ApplicationContext atx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr2 = atx.getBean("renderer", MessageRenderer.class);
        mr2.render();
    }
}
