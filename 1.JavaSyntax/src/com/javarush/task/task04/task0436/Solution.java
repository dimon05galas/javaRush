package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int heightM = Integer.parseInt(reader.readLine());
        int withN = Integer.parseInt(reader.readLine());

        for (int i=0; i<heightM; i++) {
            for (int n = 0; n < withN; n++)
                System.out.print(8);
            System.out.println("");
        }

    }
}
