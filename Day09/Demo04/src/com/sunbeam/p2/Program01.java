package com.sunbeam.p2;

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDay(10);// 1 to 31
        d1.setMonth(2); // 1 to 12
        System.out.println(d1);

        Time t1 = new Time();
        try {
            t1.setHr(10); // 0 to 23
            t1.setMin(70); // 0 to 59
            System.out.println(t1);
        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }
    }
}
