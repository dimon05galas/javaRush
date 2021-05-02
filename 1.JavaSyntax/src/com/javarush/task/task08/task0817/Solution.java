package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();
        people.put("Иванов", "Иван");
        people.put("Иванов1", "Федор");
        people.put("Иванов2","Семен");
        people.put("Иванов3","Иван");
        people.put("Иванова","Елена");
        people.put("Петров", "Петр");
        people.put("Ворчун", "Петр");
        people.put("Борчун4", "Петр");
        people.put("Карачун", "Женя");
        people.put("Борчун", "Веня");
        return people;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> uniqueNames = new ArrayList<>();
        List<String> duplicatedNames = new ArrayList<>();

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while  (iterator.hasNext()){
            Map.Entry<String,String > person = iterator.next();
            if (uniqueNames.contains(person.getValue())){
                if (duplicatedNames.contains(person.getValue())){
                }
                else
                    duplicatedNames.add(person.getValue());
            }
            else
                uniqueNames.add(person.getValue());
        }

        for (int i=0; i<duplicatedNames.size(); i++){
            removeItemFromMapByValue(map, duplicatedNames.get(i));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
