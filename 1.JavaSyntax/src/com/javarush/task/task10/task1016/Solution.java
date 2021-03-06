package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
            System.out.println(i);
        }
        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();

        //напишите тут ваш код
      for (String word : list)
        {
            if (result.containsKey(word)){
                int counter = result.get(word);
                result.put(word, ++counter);
                }
            else
            {
                result.put(word, 1);
            }

        }


        return result;
    }

}

