package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat catTima = new Cat("Tima", 3, 5, 80);
        Cat catVlad = new Cat("Vlad", 3, 5, 80);
        Cat catMorozik = new Cat("Morozik", 3, 5, 80);

        System.out.println(catMorozik.fight(catVlad));
        System.out.println(catMorozik.fight(catTima));
        System.out.println(catTima.fight(catVlad));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
