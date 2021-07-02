package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());
        Scanner scannedFile = new Scanner(inStream);

        ArrayList<Integer> numbersList = new ArrayList<>();

        while (scannedFile.hasNext()){
            int newNumber = Integer.parseInt(scannedFile.next());
            if (newNumber%2==0){
                numbersList.add(newNumber);
            }
        }
        Collections.sort(numbersList);

        for (Integer number : numbersList)
        {
            System.out.println(number);
        }
        inStream.close();
        inStream.close();
    }

}
