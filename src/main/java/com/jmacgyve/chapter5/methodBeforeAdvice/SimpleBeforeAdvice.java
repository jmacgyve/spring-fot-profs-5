package com.jmacgyve.chapter5.methodBeforeAdvice;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    public static void main(String[] args) {
        Guitarist guitarist = new Guitarist();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleBeforeAdvice());
        pf.setTarget(guitarist);

        Guitarist proxy = (Guitarist) pf.getProxy();
        proxy.sing();
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before a song ...");
    }
}