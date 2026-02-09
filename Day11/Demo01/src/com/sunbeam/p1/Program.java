package com.sunbeam.p1;
// till java 1.4

class Box {
    private Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
}

public class Program {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setObj(new Integer(10));
        Integer i1 = (Integer) b1.getObj(); // Downcasting
        System.out.println("i1 - " + i1);

        Box b2 = new Box();
        //b2.setObj(new Integer(100));
        b2.setObj(new Double(11.22));
        Double d1 = (Double) b2.getObj(); // Downcasting
        System.out.println("d1 - " + d1);

        Box b3 = new Box();
        b3.setObj("20");
        Integer i2 = (Integer) b3.getObj(); // Downcasting- ClassCastException
        System.out.println("i2 - " + i2);

    }
}
