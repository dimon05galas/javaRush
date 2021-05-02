package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> stringArrayList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<5; i++)
            stringArrayList.add(reader.readLine());

        int minLen = stringArrayList.get(0).length();
        for (int i=1; i<5; i++)
            if (stringArrayList.get(i).length()<minLen)
                minLen = stringArrayList.get(i).length();

        ArrayList<String> shortString = new ArrayList<String>();
        for (int i = 0; i<5; i++)
            if (stringArrayList.get(i).length()==minLen)
                shortString.add(stringArrayList.get(i));

        for (int i = 0; i<shortString.size(); i++)
            System.out.println(shortString.get(i));

    }
}
