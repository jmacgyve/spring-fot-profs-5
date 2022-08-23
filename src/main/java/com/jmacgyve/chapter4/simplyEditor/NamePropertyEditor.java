package com.jmacgyve.chapter4.simplyEditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] name = text.split("[^a-z A-Z]");
        setValue(new FullName(name[0], name[1]));
    }
}
