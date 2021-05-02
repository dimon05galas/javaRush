package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayString = new ArrayList<>();


        for (int i=0; i<10; i++)
            arrayString.add(reader.readLine());

        int brokenLenght = arrayString.get(0).length();

        for (int i=1; i<arrayString.size(); i++){
            if (arrayString.get(i).length()<brokenLenght){
                System.out.println(i);
                break;
            }
            else
                brokenLenght = arrayString.get(i).length();

        }

    }
}

