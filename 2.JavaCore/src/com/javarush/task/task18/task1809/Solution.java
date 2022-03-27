package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputFile1 = new FileInputStream(reader.readLine());
        FileOutputStream outputFile2 = new FileOutputStream(reader.readLine());

        int [] file1bytes = new int [inputFile1.available()];

        int counter=0;
        while (inputFile1.available()>0){
            file1bytes[counter] = inputFile1.read();
            counter++;
        }

        while (counter>0){
            outputFile2.write(file1bytes[counter-1]);
            counter--;
        }

        inputFile1.close();
        outputFile2.close();
    }
}
