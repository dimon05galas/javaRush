package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int[] bytes = new int[256];

        try{
            while (inputStream.available()>0){
                int readByte = inputStream.read();
                ++bytes[readByte];
                }
        } catch (IOException e) {
            e.printStackTrace();
        }

        inputStream.close();



        int maxRepeatsValue = 0;

        //find max value
        for (int i : bytes){
            if (i>maxRepeatsValue)
                maxRepeatsValue = i;
        }

        //find byte with max value
        for (int i=0; i<bytes.length; i++){
            if (bytes[i]==maxRepeatsValue)
                System.out.print(i + " ");
        }


    }
}