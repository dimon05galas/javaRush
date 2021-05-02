package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        double numberX = scanner.nextDouble();
        double numberY = scanner.nextDouble();

        if(numberX>0){
            if (numberY>0)
                System.out.println(1);
            else
                System.out.println(4);
        }
        else
        if (numberY>0)
            System.out.println(2);
        else
            System.out.println(3);


    }
}
