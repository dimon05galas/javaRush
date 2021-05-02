package com.javarush.task.task07.task0724;

/* 
Семейная перепись

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3.
4. Добавить в класс конструктор public

5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
Вывести объекты на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        ArrayList<Human> humalList = new ArrayList<>();

        humalList.add(new Human("Бабушка1", false, 90));
        humalList.add(new Human("Дедушка1", true, 90));

        humalList.add(new Human("Бабушка2", false, 95));
        humalList.add(new Human("Дедушка2", true, 95));

        humalList.add(new Human("Мама1", false, 50, humalList.get(0),humalList.get(1) ));
        humalList.add(new Human("Папа1", true, 50, humalList.get(0),humalList.get(1)));

        humalList.add(new Human("Мама2", false, 40, humalList.get(2),humalList.get(3) ));
        humalList.add(new Human("Папа2", true, 40, humalList.get(2),humalList.get(3)));

        humalList.add(new Human("Сын", true, 15, humalList.get(6),humalList.get(7)));

        for (int i=0; i<humalList.size(); i++)
        {
            System.out.println(humalList.get(i).toString());
        }

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}