package com.jmacgyve.chapter4.simplyEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Conf.class);
        CustomEditorExample bean = (CustomEditorExample) ctx.getBean("exampleBean");
        System.out.println(bean.getName().toString());
    }
}
