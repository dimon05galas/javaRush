package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private Boolean sex;
        private String name;
        private Integer age;
        private String[] ancestors;
        private String hairColor;
        private String skinColor;

        public Human(Boolean sex) {
            this.sex = sex;
        }

        public Human(String name)  {
            this.name = name;
        }

        public Human(Integer age)  {
            this.age = age;
        }

        public Human(String name, Integer age)  {
            this.age = age;
            this.name = name;
        }

        public Human(String name, Boolean sex)  {
            this.sex = sex;
            this.name = name;
        }

        public Human(Boolean sex, String name)  {
            this.sex = sex;
            this.name = name;
        }

        public Human(String name, Boolean sex, Integer age)  {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        public Human(String name, Integer age, Boolean sex )  {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        public Human(Boolean sex, String name, Integer age)  {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        public Human(Boolean sex,  Integer age, String name)  {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }



    }
}
