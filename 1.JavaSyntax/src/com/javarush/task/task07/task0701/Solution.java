package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array20 = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++)
            array20[i] = Integer.parseInt(reader.readLine());
        // создай и заполни массив
        return array20;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for (int i = 1; i<20; i++)
            max = array[i]>max?array[i]:max;
        return max;
    }
}
