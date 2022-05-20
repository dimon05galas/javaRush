package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileToRead = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();


       int wordCounter = 0;
        while (fileToRead.ready()){
            String[] lineSplit = fileToRead.readLine().replaceAll("\\p{Punct}", " ").split("\\s");
            for (String s: lineSplit){
                if (s.equals("world")){
                    wordCounter++;
                }
            }
        }
        System.out.println(wordCounter);

        fileToRead.close();

    }
}
