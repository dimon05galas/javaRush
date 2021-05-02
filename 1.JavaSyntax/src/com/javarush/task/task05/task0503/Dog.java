package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    //напишите тут ваш код

    String name;
    int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    /*
* 1. Программа не должна считывать данные с клавиатуры.
2. У класса Dog должна быть переменная name с типом String.
3. У класса Dog должна быть переменная age с типом int.
4. У класса должен быть сеттер для переменной name.
5. У класса должен быть геттер для переменной name.
6. У класса должен быть сеттер для переменной age.
7. У класса должен быть геттер для переменной age.
*
* */
    public static void main(String[] args) {

    }
}
