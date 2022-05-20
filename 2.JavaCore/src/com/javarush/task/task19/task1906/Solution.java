package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String filename1 = null;
        String filename2 = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            filename1  = reader.readLine();
            filename2 = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       FileReader file1 = new FileReader(filename1);
       FileWriter file2 = new FileWriter(filename2);

       while (file1.ready()){
           char[] buffer = new char[2];
           int bufferSize = file1.read(buffer);

           if (bufferSize==2){
               file2.write(buffer[1]);
           }
       }

       file1.close();
       file2.close();

    }
}
