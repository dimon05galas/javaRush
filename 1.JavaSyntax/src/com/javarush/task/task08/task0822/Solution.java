package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        /*int min = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i)<min)
                min=array.get(i);
        }*/

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну IntegerList:");
        int number = Integer.parseInt(reader.readLine());

        System.out.println("Введите элементы IntegerList каждый с новой строки:");
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
                integerList.add(Integer.parseInt(reader.readLine()));
        }

        return integerList;
    }
}
