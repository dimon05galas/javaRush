package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayInt = new ArrayList<>();
        ArrayList<Integer> arrayInt3 = new ArrayList<>();
        ArrayList<Integer> arrayInt2 = new ArrayList<>();
        ArrayList<Integer> arrayIntOther = new ArrayList<>();



        for (int i=0; i<20; i++)
            arrayInt.add(Integer.parseInt(reader.readLine()));



        for (int i=0; i<arrayInt.size(); i++){
            if (arrayInt.get(i)%3!=0 && arrayInt.get(i)%2!=0)
                arrayIntOther.add(arrayInt.get(i));
            else if (arrayInt.get(i)%3==0 && arrayInt.get(i)%2==0){
                arrayInt2.add(arrayInt.get(i));
                arrayInt3.add(arrayInt.get(i));
            }
            else if (arrayInt.get(i)%2==0)
                arrayInt2.add(arrayInt.get(i));
            else if (arrayInt.get(i)%3==0)
                arrayInt3.add(arrayInt.get(i));
        }
        printList(arrayInt3);
        printList(arrayInt2);
        printList(arrayIntOther);;

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }
}
