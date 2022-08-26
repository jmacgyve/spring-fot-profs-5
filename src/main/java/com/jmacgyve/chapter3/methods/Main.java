package com.jmacgyve.chapter3.methods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
@ComponentScan(basePackages = {"com.jmacgyve.chapter3.methods"})
public class Main {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

        BeanInterface abstractBean = ctx.getBean("abstractLookupBean", BeanInterface.class);
        BeanInterface standartBean = ctx.getBean("standartLookup", BeanInterface.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standartLookup", standartBean);
        ctx.close();
    }

    public static void displayInfo(String beanName, BeanInterface bean) {
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();

        System.out.println("Одинаковые инстансы бинов? " + (singer1 == singer2));
    }
}

// как внедрять прототип в синглтон
// https://sysout.ru/kak-ispolzovat-annotatsiyu-lookup/
