package com.javarush.task.task05.task0523;

/* 
Конструктор

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод main изменять нельзя.
3. Программа должна вывести слово "Red" на экран.
4. Метод getDescription класса Color должен возвращать значение переменной description.
5. Метод setDescription класса Color должен устанавливать значение переменной description.


*/

public class Circle {
    public Color color = new Color();

    /*public void Circle() {
        this.color = new Color();
    }*/

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }



    public class Color {
        String description;

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
