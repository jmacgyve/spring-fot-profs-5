package com.jmacgyve.chapter3.methods;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abstractLookupBean")
public class AbstractLookupBean implements BeanInterface {

    @Lookup("singer")
    public Singer getMySinger() {
        return null;
    }

    @Override
    public void doSmth() {

    }
}
