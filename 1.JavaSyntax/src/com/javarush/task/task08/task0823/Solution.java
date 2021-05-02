package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character;
import java.util.ArrayList;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код

        /*
        String[] words = string.split(" +"); // Разбиение строки на слова с помощью разграничителя (пробел)

        String result = "";
        for(String subStr:words) {
            subStr = subStr.substring(0,1).toUpperCase()+subStr.substring(1);
            result+=" "+subStr;
        }

         */

        char[] chars = string.toCharArray();

        if (Character.isLetter(chars[0]))
            chars[0] = Character.toUpperCase(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (Character.isLetter(chars[i]) && Character.isSpaceChar(chars[i-1]))
                chars[i] = Character.toUpperCase(chars[i]);
        }

        System.out.println(new String(chars));

    }
}
