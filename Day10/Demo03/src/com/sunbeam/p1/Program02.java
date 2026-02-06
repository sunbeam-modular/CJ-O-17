package com.sunbeam.p1;

public class Program02 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("sunbeam"); // Mutable String Objects -> Thread safe
        StringBuilder sb2 = new StringBuilder("sunbeam"); // Mutable String Objects -> Not Thread safe

        sb1.append(" infotech");
        sb2.append(" pune");

        System.out.println("sb1 - " + sb1);
        System.out.println("sb2 - " + sb2);
    }
}
