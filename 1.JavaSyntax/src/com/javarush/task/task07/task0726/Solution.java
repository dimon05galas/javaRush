package com.javarush.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Не компилируется задача про котиков
*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();

            if (name == null || name.isEmpty()) {
                break;
            }
            Cat cat = new Cat(name);
            CATS.add(cat);

            String age = reader.readLine();
            if (age == null || name.isEmpty()) {
                break;
            }
            CATS.get(CATS.size()-1).age = Integer.parseInt(age);

            String weight = reader.readLine();
            if (weight == null || name.isEmpty()) {
                break;
            }
            CATS.get(CATS.size()-1).weight = Integer.parseInt(weight);

            String tailLength = reader.readLine();
            if (tailLength == null || name.isEmpty()) {
                break;
            }
            CATS.get(CATS.size()-1).tailLength = Integer.parseInt(tailLength);

        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name){
            this.name = name;
        }

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}