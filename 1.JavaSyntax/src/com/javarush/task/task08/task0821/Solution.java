package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String > people = new HashMap<>();
        people.put("Giggs", "Ryan");
        people.put("Neville", "Garry");
        people.put("Neville", "Phil");
        people.put("Ferdinand", "Rio");
        people.put("Shcoles", "Paul");
        people.put("Ronalod", "Cristiano");
        people.put("Rooney", "Wayne");
        people.put("Ribery", "Frank");
        people.put("Lampard", "Frank");
        people.put("Van Nistelrooy", "Rud");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
