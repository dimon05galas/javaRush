package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());



        if (a > 0 && b > 0) {

            int nod;
            if (a==b)
                nod = a;
            else if (a>b)
                nod = findNod(b, a);
            else
                nod = findNod(a, b);

            System.out.println(nod);
        }
        else throw new Exception();




    }

    public static int findNod (int low, int high){
        int nod = 1;

        if (high%low==0)
            nod = low;
        else{
            for (int i=1; i<=high/2 && i<low; i++)
                if (high%i==0 && low%i==0)
                    nod=i;
        }
        return nod;
    }
}
