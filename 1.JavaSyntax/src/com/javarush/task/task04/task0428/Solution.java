package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[3];

        for (int i=0; i<numArray.length;i++)
            numArray[i]= scanner.nextInt();

        int above0=0;

        for (int i=0; i<numArray.length;i++)
            if (numArray[i]>0)
                above0++;

        System.out.println(above0);
    }
}
