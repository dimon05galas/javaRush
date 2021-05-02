package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.print(calculate());

    }

    public static long calculate(){
        long result=1;
        for (int i = 1; i<11; i++)
            result = result*i;
        return result;
    }
}
