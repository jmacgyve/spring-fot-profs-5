package com.jmacgyve.chapter4.beanAwareName;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main {
    public static void main(String[] args) {
        ApplicationContext atx = new AnnotationConfigApplicationContext(SimpleBean.class);
        SimpleBean simpleBean = atx.getBean(SimpleBean.class);
        simpleBean.printSimpleBean();
    }
}


@Configuration("JustUniqueName")
class SimpleBean implements BeanNameAware {

    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void printSimpleBean() {
        System.out.println(beanName + " - имя бина");
    }
}