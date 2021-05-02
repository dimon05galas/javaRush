package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map <String, Integer> salary = new HashMap<>();
        salary.put("Petrov", 200);
        salary.put("Johnson", 1200);
        salary.put("Black", 450);
        salary.put("White", 700);
        salary.put("Lee", 1200);
        salary.put("Jong", 1340);
        salary.put("Lampard", 650);
        salary.put("Scholes", 499);
        salary.put("Neolan", 500);
        salary.put("Lander", 501);
        return salary;

    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> employee = iterator.next();
            if (employee.getValue()<500)
                iterator.remove();
        }

    }

    public static void main(String[] args) {

    }
}