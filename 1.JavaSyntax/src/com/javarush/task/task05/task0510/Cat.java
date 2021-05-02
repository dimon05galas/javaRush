package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public static int averageAge = 3;
    public static int averageWeight = 3;
    public static String averageColor = "Черно-белый";


    public void initialize(String name){
        this.name = name;
        this.age = averageAge;
        this.weight = averageWeight;
        this.color = averageColor;
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = averageColor;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = averageWeight;
        this.color = averageColor;
    }

    public void initialize(int weight, String color){
        this.age = averageAge;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = averageAge;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
        /*
10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
    * */


}

/*
Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.


Требования:

* */
