package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
3. initialize, принимающий centerX, centerY, radius и инициализирующий соответствующие переменные класса.
4. initialize, принимающий centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
5. initialize, принимающий centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.


*/

public class Circle {
    //напишите тут ваш код
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    public static void main(String[] args) {

    }
}