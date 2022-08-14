package com.jmacgyve.chapter3.fields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("service")
public class Singer {

    @Autowired
    private Inspirations inspirationsBean;
    //не важно что здесь поле указано через private
    //для контейнера DI никакой разницы тк под капотом используется рефлексия

    public void sing(){
        System.out.println("... " + inspirationsBean.getLyrics());
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-fields.xml");
        ctx.refresh();

        Singer singer = ctx.getBean(Singer.class);
        singer.sing(); //... my din-din dooon
        ctx.close();
    }
}
