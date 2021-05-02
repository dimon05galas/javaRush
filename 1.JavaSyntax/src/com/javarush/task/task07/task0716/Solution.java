package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        strings = fix(strings);

        for (String stringLine : strings) {
            System.out.println(stringLine);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i=0; i<strings.size(); ){
            if (strings.get(i).contains("р") && strings.get(i).contains("л")) {
                i++;
            }
            else if (!strings.get(i).contains("р") && !strings.get(i).contains("л")) {
                i++;
            }
            else if (strings.get(i).contains("л")){
                strings.add(i+1, strings.get(i));
                i=i+2;
            }
            else if (strings.get(i).contains("р"))
                strings.remove(i);
        }
        return strings;
    }
}