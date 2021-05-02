package com.javarush.task.task05.task0529;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true){
            String line = bufferedReader.readLine();
            if (line.equals("сумма"))
                break;
            sum+=Integer.parseInt(line);
        }

        System.out.println(sum);
    }
}
