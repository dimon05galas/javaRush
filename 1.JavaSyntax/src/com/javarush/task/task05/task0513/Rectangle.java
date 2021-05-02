package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Rectangle должны быть переменные top, left, width и height с типом int.
3. У класса должен быть хотя бы один метод initialize.
4. У класса должно быть хотя бы два метода initialize.
5. У класса должно быть хотя бы три метода initialize.
6. У класса должно быть хотя бы четыре метода initialize.
*/

public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height = 0;

    public void initialize (int left, int top, int width, int height){
        this.height = height;
        this.width = width;
        this.left = left;
        this.top = top;
    }

    public void initialize (int left, int top){
        this.left = left;
        this.top = top;
    }

    public void initialize (int left, int top, int width){
        this.width = width;
        this.height = width;
        this.left = left;
        this.top = top;
    }

    public void initialize (Rectangle original){
        this.width = original.width;
        this.height = original.height;
        this.left = original.left;
        this.top = original.top;
    }



    public static void main(String[] args) {

    }
}
