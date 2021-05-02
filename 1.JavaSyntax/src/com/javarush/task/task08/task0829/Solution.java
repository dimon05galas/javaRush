package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }

            list.add(city);
            list.add(family);
        }

        // Read the city
        String city = reader.readLine();

        if (list.contains(city)) {
            int cityIndex = list.indexOf(city);
            System.out.println(list.get(cityIndex+1));
        }

        */


        Map<String, String> map = new HashMap<>();
        while (true) {


            String city = reader.readLine();
            if (city.isEmpty())
                break;

            String family = reader.readLine();
            if (family.isEmpty())
                break;

            map.put(city, family);

        }

        // Read the city
        String city = reader.readLine();

        if (map.containsKey(city)) {
            //System.out.println("contains key");   //проверка
            System.out.println(map.get(city));
        }


    }
}
