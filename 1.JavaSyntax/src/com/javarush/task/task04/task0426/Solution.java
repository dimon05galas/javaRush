package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        if (number!=0){
            if (number>0)
                System.out.print("положительное ");
            else
                System.out.print("отрицательное ");

            if (number%2==0)
                System.out.print("четное число");
            else
                System.out.print("нечетное число");
        }
        else
            System.out.println("ноль");

    }
}
