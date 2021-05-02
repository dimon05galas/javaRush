package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat format =  new SimpleDateFormat("MMM dd yyyy");
        Date inputtedDate = format.parse(date);


        Date startOfYear = new Date();
        startOfYear.setDate(1);
        startOfYear.setMonth(0);
        startOfYear.setYear(inputtedDate.getYear());

        long timeDifference = inputtedDate.getTime()-startOfYear.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        boolean isDateOdd;
        if ((timeDifference/msDay)%2==1)
            isDateOdd = true;
        else
            isDateOdd = false;

        return isDateOdd;
    }
}
