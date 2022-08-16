package com.jmacgyve.chapter4.init;

public class Singer {
    private final static String defaultName = "DEFAULT NAME";
    private String name;
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init() {
        System.out.println("Инициализация бина");

        if (name == null) name = defaultName;

        if (age == Integer.MIN_VALUE) throw new IllegalArgumentException("Задайте значение age");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}