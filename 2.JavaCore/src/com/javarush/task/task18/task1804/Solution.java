package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        int[] bytes = new int[256];

        try{
            while (fileInputStream.available()>0){
                int readByte = fileInputStream.read();
                ++bytes[readByte];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileInputStream.close();

        int minByteValue = 255;

        for (int i : bytes)
            if (i!=0 && i<minByteValue)
                minByteValue = i;

        //display minimal byte values
        for (int i=0; i<bytes.length; i++)
            if (bytes[i]==minByteValue)
                System.out.print(i + " ");

    }
}
