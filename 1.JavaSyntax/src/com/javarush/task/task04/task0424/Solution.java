package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(String.valueOf(reader.read()));
        int num2 = Integer.parseInt(String.valueOf(reader.read()));
        int num3 = Integer.parseInt(String.valueOf(reader.read()));
        int num4 = Integer.parseInt(String.valueOf(reader.read()));
         */

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1==num2)
            System.out.println(3);
        else if (num1==num3)
            System.out.println(2);
        else if (num2==num3)
            System.out.println(1);

    }
}
