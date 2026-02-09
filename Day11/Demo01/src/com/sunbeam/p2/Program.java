package com.sunbeam.p2;

// from java 1.5
// by using Generics
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
        b1.setObj(new Integer(10));
        Integer i1 = b1.getObj();
        System.out.println("i1 - " + i1);

        Box<Double> b2 = new Box<Double>();
        b2.setObj(new Double(11.22));
        Double d1 = b2.getObj();
        System.out.println("d1 - " + d1);

        Box<String> b3 = new Box<String>();
        b3.setObj("20");
        // Integer i2 = (Integer) b3.getObj(); // NOT OK -> Compile time error
        String s1 = b3.getObj();
        System.out.println("s1 - " + s1);
    }
}
