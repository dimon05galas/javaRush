package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name1,name2,name3;
        Scanner scanner = new Scanner(System.in);
        name1 = scanner.nextLine();
        name2 = scanner.nextLine();
        name3 = scanner.nextLine();
        System.out.println(name1+" + "+name2+" + "+name3+" = Чистая любовь, да-да!");
    }
}