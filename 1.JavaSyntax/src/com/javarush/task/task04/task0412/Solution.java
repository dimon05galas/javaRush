package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        if (number>0)
            number=number*2;
        else if (number<0)
            number++;

        System.out.println(number);
    }

}