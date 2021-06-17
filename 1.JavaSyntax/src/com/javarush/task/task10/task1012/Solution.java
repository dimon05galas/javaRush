package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код

        //создаем Map для удобства счета и вывода символов
        HashMap<Character, Integer> countLetters = new HashMap<Character, Integer>();
        Iterator<Character> iterator = alphabet.iterator();
        while (iterator.hasNext())
        {
            Character letter = iterator.next();
            countLetters.put(letter, 0);
        }


        //перебор строк ArrayList
        Iterator<String> iteratorList = list.iterator();
        while (iteratorList.hasNext())
        {
            String textLine = iteratorList.next();
            char[] charLine = textLine.toCharArray();
            for (int i=0; i<charLine.length; i++){
                identifyLetter(charLine[i], countLetters);
            }

        }
//       System.out.println(countLetters);
//       System.out.println("Вывод с помощью printAlphabetStatictics");

        printAlphabetStatictics(alphabet, countLetters);




    }

    public static void identifyLetter(Character letter, HashMap<Character, Integer> map) {
        if (map.containsKey(letter)){
            int i = map.get(letter)+1;
            map.put(letter, i);
        }
    }

    public static void printAlphabetStatictics (List<Character> alphabet, HashMap<Character, Integer> map ){
        Iterator<Character> iterator = alphabet.iterator();
        while (iterator.hasNext())
        {
            Character letter = iterator.next();
            System.out.println(letter.toString() + ' ' + map.get(letter).toString());
        }
       }

}
