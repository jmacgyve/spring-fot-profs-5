package com.jmacgyve.chapter4.simplyEditor;

import org.springframework.beans.factory.annotation.Value;

public class CustomEditorExample {

    @Value("Eugene-Goldyrev")
    private FullName name;

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        System.out.println("check == " + name);
        this.name = name;
    }
}
