package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] newArray = new int[5];
        for (int i=0; i<newArray.length; i++)
            newArray[i] = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        sortArray(newArray);

        for (int i=0; i<newArray.length; i++)
            System.out.println(newArray[i]);

    }

    public static void sortArray(int[] array){
        for (int out=array.length-1; out>=1; out--){
            for (int in = 0; in < out; in++)
                if(array[in] > array[in + 1]){
                //Если порядок элементов нарушен
                    int buffer = array[in];
                    array[in]=array[in+1];
                    array[in+1] = buffer;

                    }

                }
        }
    }

