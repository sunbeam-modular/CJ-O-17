package com.sunbeam.p1;

// unchecked Exception
public class Date {
    private int day;
    private int month;

    public void setDay(int day) {
        if (day < 1 || day > 31)
            throw new RuntimeException(); // generates an unchecked Exception
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            throw new RuntimeException("month value should be between 1 and 12");
        this.month = month;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                '}';
    }
}
