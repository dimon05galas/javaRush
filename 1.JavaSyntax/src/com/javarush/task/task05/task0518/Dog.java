package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек

Регистрируем собачек
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет


Требования:

4. параметра имя и инициализирующий соответствующую переменную класса.
5. параметров имя, рост и инициализирующий соответствующие переменные класса.
6. параметров имя, рост, цвет и инициализирующий соответствующие переменные класса.
*/


public class Dog {
    //напишите тут ваш
    String name;
    String color;
    int height;

    public Dog(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public Dog(String name, int height){
        this.name = name;
        this.height = height;
    }

    public Dog(String name){
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
