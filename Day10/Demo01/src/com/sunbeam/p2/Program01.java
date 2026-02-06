package com.sunbeam.p2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("d1 - " + d1);
        Date d2 = new Date(2026 - 1900, 2 - 1, 10);
        System.out.println("d2 - " + d2);

        Calendar c1 = new GregorianCalendar();
        System.out.println("c1 - " + c1);

        Calendar c2 = Calendar.getInstance();
        System.out.println("c2 - " + c2);

        System.out.println("Day - " + c2.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month - " + (c2.get(Calendar.MONTH) + 1));
        System.out.println("Year - " + c2.get(Calendar.YEAR));

        c1.set(Calendar.DAY_OF_MONTH, 10);
        System.out.println("c1 - " + c1);
        
    }
}
