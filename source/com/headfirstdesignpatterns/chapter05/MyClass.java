package com.headfirstdesignpatterns.chapter05;

public class MyClass {

    private MyClass() {}

    public static MyClass getInstance() {
        return new MyClass();
    }
}
