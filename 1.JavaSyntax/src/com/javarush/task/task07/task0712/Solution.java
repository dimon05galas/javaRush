package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<String>();

        for (int i=0; i<10; i++)
            stringArrayList.add(reader.readLine());

        int maxLengh = stringArrayList.get(0).length();
        int minLengh = stringArrayList.get(0).length();
        int maxLenghInd = 0;
        int minLenghInd = 0;

        for (int i=1; i<stringArrayList.size(); i++){
            if (stringArrayList.get(i).length()>maxLengh){
                maxLengh=stringArrayList.get(i).length();
                maxLenghInd=i;
            }
            if (stringArrayList.get(i).length()<minLengh){
                minLengh=stringArrayList.get(i).length();
                minLenghInd=i;
            }
        }

        if (maxLenghInd<minLenghInd)
            System.out.println(stringArrayList.get(maxLenghInd));
        else
            System.out.println(stringArrayList.get(minLenghInd));
    }
}
