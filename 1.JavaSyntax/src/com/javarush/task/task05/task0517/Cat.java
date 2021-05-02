package com.javarush.task.task05.task0517;

/* 
Конструируем котиков

Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.


Требования:

10.принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public static int averageAge = 3;
    public static int averageWeight = 4;
    public static String averageColor = "Black";

    public Cat(String name){
        this.name = name;
        this.age = averageAge;
        this.weight = averageWeight;
        this.color = averageColor;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = averageColor;
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = averageWeight;
        this.color = averageColor;
    }

    public Cat(int weight, String color){
        this.age = averageAge;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        this.age = averageAge;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
