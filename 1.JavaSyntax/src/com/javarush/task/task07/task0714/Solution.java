package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayWords = new ArrayList<>();

        for (int i=0; i<5; i++){
            arrayWords.add(reader.readLine());
        }

        arrayWords.remove(2);


        /*
        for (int i = arrayWords.size(); i<=0; i--){
            System.out.println(arrayWords.get(i));
            System.out.println("__");
        }

         */
        for (int i = arrayWords.size()-1; i>=0; i--){
            System.out.println(arrayWords.get(i));
        }
    }
}
