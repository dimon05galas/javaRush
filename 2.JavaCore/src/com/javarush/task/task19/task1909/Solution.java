package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileToRead = reader.readLine();
        String fileToWrite = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileToRead));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileToWrite));


        while (fileReader.ready()){
            String line = fileReader.readLine();
            fileWriter.write(line.replaceAll("\\.", "!"));
        }

        fileReader.close();
        fileWriter.close();



    }
}
