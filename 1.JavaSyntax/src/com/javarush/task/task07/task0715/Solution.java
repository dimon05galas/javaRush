package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");

        int arraySize = arrayList.size();

        for (int i=0; i<arraySize; i++){
            int index = i*2+1;
            arrayList.add(index, "именно");
        }

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
