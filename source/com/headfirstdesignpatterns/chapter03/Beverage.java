package com.headfirstdesignpatterns.chapter03;

public abstract class Beverage {
    public static final int TALL = 1;
    public static final int GRANDE = 2;
    public static final int VENTI = 3;

    int size = TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract double cost();
}
