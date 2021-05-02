package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш
        List<Integer> list = new ArrayList();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int maxN = 1, maxBuffer = 1;
        
        for (int i=0; i<list.size()-1; i++){
            if (list.get(i).equals(list.get(i+1))){
                maxBuffer++;
            }

            else{
                if (maxBuffer>maxN){
                    maxN=maxBuffer;
                    maxBuffer=1;
                }
                else{
                    maxBuffer=1;
                }
            }

            if (maxBuffer>maxN){
                maxN=maxBuffer;
            }
        }

        System.out.println(maxN);

        }

    }

