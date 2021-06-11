package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] inputtedChars = reader.readLine().toCharArray();
        int charLength = inputtedChars.length;

        ArrayList<Character> vowelsOnly = new ArrayList<>();
        ArrayList<Character> vowelsDeleted = new ArrayList<>();
        
        for (int i = 0; i < charLength; i++){
            if (isVowel(inputtedChars[i])==true){ 
                vowelsOnly.add(inputtedChars[i]);
                vowelsOnly.add(" ".charAt(0));
            }
            else{
                if (inputtedChars[i]==" ".charAt(0)){
                }
                else {
                    vowelsDeleted.add(inputtedChars[i]);
                    vowelsDeleted.add(" ".charAt(0));
                }
            }
        }

        for (Character character : vowelsOnly) {
            System.out.print(character);
        }

        System.out.print(" ");
        System.out.println();

        for (Character character : vowelsDeleted) {
            System.out.print(character);
        }
        System.out.print(" ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }


}