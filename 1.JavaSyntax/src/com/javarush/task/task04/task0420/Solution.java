package com.javarush.task.task04.task0420;

import sun.util.resources.cldr.cs.CalendarData_cs_CZ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>=b && a>=c && b>=c)
            System.out.println(a + " " + b + " " + c);
        else if (a>=b && a>=c && b<=c)
            System.out.println(a + " " + c + " " + b);
        else if (b>=a && b>=c && a>=c)
            System.out.println(b + " " + a + " " + c);
        else if (b>=a && b>=c && a<=c)
            System.out.println(b + " " + c + " " + a);
        else if (c>=a && c>=b && a>=b)
            System.out.println(c + " " + a + " " + b);
        else if (c>=a && c>=b && a<=b)
            System.out.println(c + " " + b + " " + a);

    }

}
