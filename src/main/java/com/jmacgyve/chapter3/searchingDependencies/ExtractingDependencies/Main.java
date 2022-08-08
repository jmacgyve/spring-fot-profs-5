package com.jmacgyve.chapter3.searchingDependencies.ExtractingDependencies;

import com.jmacgyve.chapter2.problem1.StandardOurMessageRender;
import com.jmacgyve.chapter2.problem1.interfaces.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Поиск зависимостей: извлечение зависимостей
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageRenderer messageRenderer = ctx.getBean("renderer", StandardOurMessageRender.class);
        messageRenderer.render();
    }
}
