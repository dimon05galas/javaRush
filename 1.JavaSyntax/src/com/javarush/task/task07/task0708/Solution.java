package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Solution.strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++)
            strings.add(reader.readLine());

        int maxLenght = 0;
        for (int i=0; i<5; i++){
            if (strings.get(i).length()>maxLenght)
                maxLenght = strings.get(i).length();
        }

        ArrayList<String> longString = new ArrayList<String>();
        for (int i=0; i<5; i++){
            if (strings.get(i).length()==maxLenght)
                longString.add(strings.get(i));
        }

        for (int i=0; i<longString.size(); i++){
            System.out.println(longString.get(i));
        }
}
}
