package com.jmacgyve.chapter2.problem2;

import com.jmacgyve.chapter2.problem1.interfaces.MessageProvider;
import com.jmacgyve.chapter2.problem1.interfaces.MessageRenderer;

public class Main2 {
    //Внедрили фабрику
    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
