package com.sunbeam.p1;

class Date implements Cloneable {
    int day;
    int month;
    int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public Date clone() throws CloneNotSupportedException {
        return (Date) super.clone();
    }
}

public class Program01 {
    public static void main(String[] args) {
        Date d1 = new Date(1, 1, 2000);
        try {
            Date d2 = d1.clone();
            d2.day = 20;
            System.out.println("d1 - " + d1);
            System.out.println("d2 - " + d2);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
