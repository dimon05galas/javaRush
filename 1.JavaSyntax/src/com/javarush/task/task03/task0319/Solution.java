package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name, number1, number2;

        name = scanner.nextLine();
        number1 = scanner.nextLine();
        number2 = scanner.nextLine();

        System.out.println(name+" получает "+number1+" через "+number2+" лет.");

    }
}
