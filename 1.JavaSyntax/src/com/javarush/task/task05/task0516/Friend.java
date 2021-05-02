package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
Друзей не купишь
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол


Требования:
4. конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
5. конструктор, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
6. конструктор, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public Friend(String name){
        this.name = name;
    }

    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
