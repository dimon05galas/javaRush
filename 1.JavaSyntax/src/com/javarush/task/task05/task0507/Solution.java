package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;
        int counter = 0;
        boolean doFlag = true;

        while (doFlag){
            float newNUmber = Float.parseFloat(bufferedReader.readLine());
            if (newNUmber!=-1) {
                sum += newNUmber;
                counter++;
            }
            else
                doFlag = false;
        }
        System.out.println(sum/counter);
    }
}

