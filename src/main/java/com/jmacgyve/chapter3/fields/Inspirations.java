package com.jmacgyve.chapter3.fields;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Inspirations {
    private String lyrics = "you touch my tralala";

    public Inspirations(@Value("my din-din dooon") String lyrics) {
        this.lyrics = lyrics;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
