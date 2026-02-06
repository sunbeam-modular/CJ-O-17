package com.sunbeam.p1;

public class Program04 {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer(); // 16
        sb1.append("12345678901234567");
        System.out.println("sb1 - " + sb1);
        System.out.println("sb1 capacity - " + sb1.capacity());
    }
}
