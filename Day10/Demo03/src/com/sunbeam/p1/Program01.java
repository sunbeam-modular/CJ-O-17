package com.sunbeam.p1;

public class Program01 {
    public static void main(String[] args) {
        String s1 = new String("Sunbeam"); // Immutable
        String s2 = s1.concat(" Infotech"); // New object is created

        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);
    }
}
