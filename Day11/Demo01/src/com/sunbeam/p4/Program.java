package com.sunbeam.p4;

import java.util.Date;

// Bounded type -> for classes
class Box<T extends Number> {
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

public class Program {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.setObj(10);

        Box<Double> b2 = new Box<>();
        b2.setObj(11.22);

        //Box<String> b3 = new Box<>(); // NOT OK
        //b3.setObj("sunbeam");

        //Box<Date> b4 = new Box<>(); // NOT OK
        //b4.setObj(new Date());
    }
}
