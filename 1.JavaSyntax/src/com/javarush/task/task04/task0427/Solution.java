package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /*
        * Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100
        * */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number>0 && number<1000){
            if (number%2==0)
                System.out.print("четное ");
            else
                System.out.print("нечетное ");

            if (number/100>0)
                System.out.print("трехзначное число");
            else if (number/10>0)
                System.out.print("двузначное число");
            else
                System.out.print("однозначное число");
        }

    }
}
