package com.sunbeam.p5;

import java.util.Date;

class Box<T> {
    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

public class Program {
    // unbounded type can be used only for class reference
    // unbounded type -> ? (wild card)
    public static void display(Box<?> b) {
        System.out.println("value - " + b.getObj());
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<Double> b2 = new Box<>(11.22);
        Box<Number> b3 = new Box<>(30);
        Box<String> b4 = new Box<>("sunbeam");
        Box<Date> b5 = new Box<>(new Date());

        display(b1);
        display(b2);
        display(b3);
        display(b4);
        display(b5);

    }
}
