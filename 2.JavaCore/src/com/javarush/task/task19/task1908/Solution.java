package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileToReadName = null;
        String fileToWirteName = null;


        try {
            fileToReadName = reader.readLine();
            fileToWirteName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader fileToRead = new BufferedReader(new FileReader(fileToReadName));
        BufferedWriter fileToWrite = new BufferedWriter(new FileWriter(fileToWirteName));

        while (fileToRead.ready()){
            String line = fileToRead.readLine();
            String[] lineArray = line.split("\\s");

            String numbersLine = "";
            for(String s: lineArray){
                if(s.matches("\\d+")){
                    numbersLine = numbersLine + s + " ";
                }

            }
            if (numbersLine.length()>0){
                numbersLine = numbersLine.trim();
            }

            fileToWrite.write(numbersLine);
        }

        fileToRead.close();
        fileToWrite.close();
    }
}
