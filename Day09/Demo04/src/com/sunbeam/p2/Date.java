package com.sunbeam.p2;

// unchecked Exception
// Custom Exception class
class InvalidDateException extends RuntimeException {
    public InvalidDateException() {
    }

    public InvalidDateException(String message) {
        super(message);
    }
}

public class Date {
    private int day;
    private int month;

    public void setDay(int day) {
        if (day < 1 || day > 31)
            throw new InvalidDateException(); // generates an unchecked Exception
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            throw new InvalidDateException("month value should be between 1 and 12");
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
