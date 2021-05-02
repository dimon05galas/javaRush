package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> citizens = new HashMap<>();
        citizens.put("Иванов", "Иван");
        citizens.put("Иванов1", "Федор");
        citizens.put("Иванов2","Семен");
        citizens.put("Иванов3","Игорь");
        citizens.put("Иванова","Елена");
        citizens.put("Петров", "Петр");
        citizens.put("Ворчун", "Петр");
        citizens.put("Борчун4", "Петр");
        citizens.put("Карачун", "Женя");
        citizens.put("Борчун", "Веня");
        return citizens;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int counter = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String > person = iterator.next();
            if (name.equals(person.getValue()))
                counter++;
        }
        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int counter = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String > person = iterator.next();
            if (lastName.equals(person.getKey()))
                counter++;
        }
        return counter;

    }

    public static void main(String[] args) {

    }
}
