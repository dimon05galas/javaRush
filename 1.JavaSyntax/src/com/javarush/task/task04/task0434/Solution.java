package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int y=1;

        while (y<11){
            int x = 1;
            while (x<11)
            {
               System.out.print(x*y+" ");
               x++;
            }
            System.out.println("");
            y++;

        }

    }
}
