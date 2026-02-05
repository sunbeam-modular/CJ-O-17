package com.sunbeam.p1;

// checked exception
public class Time {
    private int hr;
    private int min;

    public void setHr(int hr) throws Exception {
        if (hr < 0 || hr > 23)
            throw new Exception(); // Checked Exception
        this.hr = hr;
    }

    public void setMin(int min) throws Exception {
        if (min < 0 || min > 59)
            throw new Exception("min should be between 0 and 59");
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
