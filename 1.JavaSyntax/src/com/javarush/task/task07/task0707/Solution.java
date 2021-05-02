package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> newArray = new ArrayList<>();

        for (int i=0; i<5; i++)
        {
            newArray.add("line "+i);
        }

        System.out.println(newArray.size());

        for (int i=0; i < newArray.size(); i++)
            System.out.println(newArray.get(i));

    }
}
