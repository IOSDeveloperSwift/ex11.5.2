package com.Doloscan;

public class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String name, int day, String month) {
        this.month = month;
        this.day = day;
        this.name = name;
    }

    boolean inSameMonth(Holiday i) {
        return i.month == month;
    }

    double avgDate(Holiday[] hol) {
        int sum = 0;

        for (int i = 0; i < hol.length; i++)
            sum += hol[i].day;

        return ((double) sum) / hol.length;
    }


}
