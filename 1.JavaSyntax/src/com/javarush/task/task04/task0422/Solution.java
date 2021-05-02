package com.javarush.task.task04.task0422;

import sun.util.resources.cldr.cs.CalendarData_cs_CZ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();


        if (age < 18)
            System.out.println("Подрасти еще");

        /*
        for (int i=0; i<2; i++) {
            int age = scanner.nextInt();
            String name = scanner.nextLine();

            if (age < 18)
                System.out.println("Подрасти еще");
        }

         */
    }
}
