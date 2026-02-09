package com.sunbeam.p3;

// Generic class
class Box<T> {
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
        Box<Integer> b1 = new Box<Integer>();
        b1.setObj(10);
        //b1.setObj(11.22); // NOT OK
        //b1.setObj("sunbeam"); // NOT OK

        Box<String> b2 = new Box<>();
        //b2.setObj(10);// NOT OK
        //b2.setObj(11.22);// NOT OK
        b2.setObj("sunbeam");

        // Box<Object> b3 = new Box<Object>(); // OK - Raw type
        Box b3 = new Box(); // Raw type
        b3.setObj(10);
        b3.setObj(11.22);
        b3.setObj("sunbeam");
    }
}
