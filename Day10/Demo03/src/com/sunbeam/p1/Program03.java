package com.sunbeam.p1;

public class Program03 {
    public static void main(String[] args) {
        String s1 = new String("sunbeam");
        String s2 = new String("sunbeam");

        StringBuffer sb1 = new StringBuffer("sunbeam");
        StringBuffer sb2 = new StringBuffer("sunbeam");

        System.out.println("s1 - " + s1);
        System.out.println("s2 - " + s2);

        System.out.println("sb1 - " + sb1);
        System.out.println("sb2 - " + sb2);

        System.out.println("s1==s2 - " + (s1 == s2)); // false
        System.out.println("sb1==sb2 - " + (sb1 == sb2)); // false

        System.out.println("s1.equals(s2) - " + s1.equals(s2)); // true
        System.out.println("sb1.equals(sb2) - " + sb1.equals(sb2)); // false
        // StringBuilder and StringBuffer class have not overriden the equals and hashcode methods

    }
}
