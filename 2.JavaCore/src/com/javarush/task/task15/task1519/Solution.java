package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String inputtedLine = reader.readLine();
            if (!inputtedLine.equals("exit")){
                //check if line could be Double
                if (inputtedLine.contains("."))
                   try{
                       print(Double.valueOf(inputtedLine));
                   }
                    catch (Exception e){
                        print(inputtedLine);
                    }
                 else
                     try{
                         Integer a = Integer.parseInt(inputtedLine);
                         if (a>=128 || a<=0)
                             print(a);
                         else
                             print(Short.valueOf(inputtedLine));
                     }
                     catch (Exception e){
                         print(inputtedLine);
                     }
               }
            else
                break;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
