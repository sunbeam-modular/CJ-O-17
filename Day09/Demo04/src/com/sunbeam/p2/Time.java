package com.sunbeam.p2;

// checked exception
// custom exception class
class InvalidTimeException extends Exception {
    public InvalidTimeException() {
    }

    public InvalidTimeException(String message) {
        super(message);
    }
}

public class Time {
    private int hr;
    private int min;

    public void setHr(int hr) throws InvalidTimeException {
        if (hr < 0 || hr > 23)
            throw new InvalidTimeException(); // Checked Exception
        this.hr = hr;
    }

    public void setMin(int min) throws InvalidTimeException {
        if (min < 0 || min > 59)
            throw new InvalidTimeException("min should be between 0 and 59");
        this.min = min;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hr=" + hr +
                ", min=" + min +
                '}';
    }
}
