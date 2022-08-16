package com.jmacgyve.chapter3.methods;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singer")
@Scope("prototype")
public class Singer {
    public static final String lyric = "singer singer sing a song";
    public void sing() {
        System.out.println(lyric);
    }
}
