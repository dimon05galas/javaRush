package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> intArray = new ArrayList<>();
        intArray.add(randomArray(5));
        intArray.add(randomArray(2));
        intArray.add(randomArray(4));
        intArray.add(randomArray(7));
        intArray.add(randomArray(0));
        return intArray;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }

    public static int[] randomArray(int i){
        int[] randomInt = new int[i];
        for (int n=0; n<i; n++)
            randomInt[n]=(int)(Math.random() * 100);
        return randomInt;
    }
}


