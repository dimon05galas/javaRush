package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "string1");
        labels.put(2.0, "string2");
        labels.put(3.0, "string3");
        labels.put((double)4, String.valueOf(20));
        labels.put(5*1.0, String.valueOf(20));
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
