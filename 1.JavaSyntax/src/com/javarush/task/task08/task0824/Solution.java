package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> humans = new ArrayList<>();

        Human child1 = new Human("Ivan 1", true, 11);
        humans.add(child1);

        Human child2 = new Human("Fedor 2", true, 12);
        humans.add(child2);

        Human child3 = new Human("Lena 3", false, 13);
        humans.add(child3);

        Human father = new Human("Anakin", true, 40, child1, child2, child3);
        humans.add(father);

        Human mother = new Human("Padme", false, 38, child1, child2, child3);
        humans.add(mother);

        Human grandpaF = new Human("GrandpaF", true, 70, father);
        humans.add(grandpaF);

        Human grandmaF = new Human("GrandmaF", false, 65, father);
        humans.add(grandmaF);

        Human grandpaM = new Human("GrandpaM", true, 70, mother);
        humans.add(grandpaM);

        Human grandmaM = new Human("GrandmaM", false, 65, mother);
        humans.add(grandmaM);

        for (Human familyMember:humans)
            System.out.println(familyMember.toString());


        //humans.get(1).toString();
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        Integer age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, Boolean sex, Integer age, Human... children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
