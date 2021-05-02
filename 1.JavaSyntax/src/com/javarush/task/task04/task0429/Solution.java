package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i=0; i<numbers.length; i++)
            numbers[i]=scanner.nextInt();

        int above0=0;
        int down0=0;

        for (int i=0; i<numbers.length; i++)
            if (numbers[i]>0)
                above0++;
            else if(numbers[i]<0)
                down0++;

        System.out.println("количество отрицательных чисел: "+down0);
        System.out.println("количество положительных чисел: "+above0);

    }
}
