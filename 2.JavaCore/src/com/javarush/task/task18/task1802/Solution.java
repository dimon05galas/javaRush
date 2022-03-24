package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int minByte = 255;

        while (inputStream.available()>0){
            int readByte = inputStream.read();
            if (readByte<minByte)
                minByte = readByte;

        }
        inputStream.close();
        System.out.println(minByte);
    }
}
