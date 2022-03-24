package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        //ArrayList<Integer> bytes = new ArrayList<>();
        TreeSet<Integer> bytes = new TreeSet<Integer>();


        try{
            while (fileInputStream.available()>0){
                int readByte = fileInputStream.read();
                bytes.add(readByte);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        reader.close();
        fileInputStream.close();

        //Collections.sort(bytes);

//        for (int i=0; i<bytes.size()-1; i++){
//            while (true){
//                if (bytes.get(i) == bytes.get(i+1))
//                    bytes.remove(i+1);
//                else
//                    break;
//            }
//            System.out.print(bytes.get(i) + " ");
//
//        }

        for (Integer i : bytes) {
            System.out.print(i + " ");
        }
    }
}
