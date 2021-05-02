package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[3];
        for (int i=0; i<num.length; i++)
            num[i] = Integer.parseInt(reader.readLine());

        num = sort(num);
        System.out.println(num[1]);


    }
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int aj = array[j];
                    int ai = array[i];
                    array[j] = ai;
                    array[i] = aj;
                }
            }
        }
        return array;
    }

}

