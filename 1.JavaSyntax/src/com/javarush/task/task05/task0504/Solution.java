package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat catPeter = new Cat("Peter", 4, 5, 80);
        Cat catStepan = new Cat("Stepan", 3, 2, 70);
        Cat catFedor = new Cat("Fedor", 3, 6, 55);


    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}