package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String inputtedDate = reader.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat formatterN = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        try
        {
            Date date = formatter.parse(inputtedDate);
            ;
            System.out.println(formatterN.format(date).toUpperCase(Locale.ROOT));
        }
        catch (Exception e){

        }
    }

    }
