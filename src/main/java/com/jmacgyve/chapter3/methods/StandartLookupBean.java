package com.jmacgyve.chapter3.methods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("standartLookup")
public class StandartLookupBean implements BeanInterface {

    private Singer mySinger;

    @Autowired
    @Qualifier("singer")
    public void setMySinger(Singer mySinger) {
        this.mySinger = mySinger;
    }

    @Override
    public Singer getMySinger() {
       return this.mySinger;
    }

    @Override
    public void doSmth() {
        mySinger.sing();
    }
}
