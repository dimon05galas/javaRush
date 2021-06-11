package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> numbersArray = new ArrayList<>();

        while (true)
            {
                try {
                    double i = Double.parseDouble(reader.readLine());
                    numbersArray.add(i);
                }
                catch (NumberFormatException | IOException e) {
                    break;
                }
            }

        Iterator<Double> iterator = numbersArray.iterator();
        while (iterator.hasNext()) {
            // Double number = iterator.next();

            System.out.println(iterator.next());
        }

    }
}
