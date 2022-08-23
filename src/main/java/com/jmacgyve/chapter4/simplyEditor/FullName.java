package com.jmacgyve.chapter4.simplyEditor;

public class FullName {
    private String name;
    private String lastName;

    public FullName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "имя = '" + name + '\'' +
                ", фамилия = '" + lastName + '\'' +
                '}';
    }
}
