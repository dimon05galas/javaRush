package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> valuesMap = new HashMap<>();

        while(true){
            String numberLine = reader.readLine();
            if (numberLine.isEmpty()){
                break;
            }
            else{
                int id = Integer.parseInt(numberLine);
                String name = reader.readLine();
                valuesMap.put(name, id);
                //System.out.println("Id=" + id + " Name=" + name);
            }
        }

        for (Map.Entry<String, Integer> pair : valuesMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
