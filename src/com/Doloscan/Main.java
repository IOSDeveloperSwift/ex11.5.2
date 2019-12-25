package com.Doloscan;

public class Main {

    public static void main(String[] args) {


        Holiday holiday1 = new Holiday("Ziua Independendei", 4, "Iulie");
        Holiday holiday2 = new Holiday("8 Martie", 8, "Martie");

        System.out.println(holiday1.inSameMonth(holiday2));



    }
}
