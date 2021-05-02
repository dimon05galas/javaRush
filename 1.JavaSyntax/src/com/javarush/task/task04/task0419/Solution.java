package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if (compare(a,b)>compare(c,d))
            System.out.println(compare(a,b));
        else
            System.out.println(compare(c,d));


    }

    public static double compare(double number1, double number2){
        double maxN;
        if (number1>number2)
            maxN=number1;
        else
            maxN=number2;
        return maxN;
    }

}
