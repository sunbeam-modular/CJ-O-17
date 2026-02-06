package com.sunbeam.p2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program03 {
    public static void main(String[] args) {
        String s1 = "2026-03-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = sdf.parse(s1);
            System.out.println("d1 - " + d1);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        //LocalDate d2 = LocalDate.parse(s1);
        // OR
        LocalDate d2 = LocalDate.parse(s1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("d2 - " + d2);


    }
}
