package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Set<String> greenSet = new HashSet<String>();

        greenSet.add("арбуз");
        greenSet.add("банан");
        greenSet.add("вишня");
        greenSet.add("груша");
        greenSet.add("дыня");
        greenSet.add("ежевика");
        greenSet.add("женьшень");
        greenSet.add("земляника");
        greenSet.add("ирис");
        greenSet.add("картофель");

        for (String greenLine:greenSet)
            System.out.println(greenLine);


    }
}
