package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int maximum;
        int minimum;

        //напишите тут ваш
        int [] arrayInt = getInts();

        maximum = minimum = arrayInt[0];
        for (int i=1; i<20; i++){
            if (arrayInt[i]>maximum)
                maximum = arrayInt[i];
            if (arrayInt[i]<minimum)
                minimum = arrayInt[i];
        }



        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[20];
        for (int i = 0; i<arrayInt.length; i++)
            arrayInt[i] = Integer.parseInt(reader.readLine());
        return arrayInt;
    }
}
