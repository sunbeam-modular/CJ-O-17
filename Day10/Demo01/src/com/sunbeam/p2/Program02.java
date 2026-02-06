package com.sunbeam.p2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Program02 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        System.out.println("d1 - " + d1);

        LocalDate d2 = LocalDate.of(2026, 2, 10);
        System.out.println("d2 - " + d2);


    }
}
