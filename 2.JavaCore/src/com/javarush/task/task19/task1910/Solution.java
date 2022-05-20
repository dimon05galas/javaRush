package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileToReadName = null;
        String fileToWriteName = null;

        try {
            fileToReadName = reader.readLine();
            fileToWriteName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        BufferedReader fileToRead = new BufferedReader(new FileReader(fileToReadName));
        BufferedWriter fileToWrite = new BufferedWriter(new FileWriter(fileToWriteName));

        while (fileToRead.ready()){
            String line = fileToRead.readLine();
            fileToWrite.write(line.replaceAll("[\\pP]", ""));
        }

        fileToRead.close();
        fileToWrite.close();


    }
}
