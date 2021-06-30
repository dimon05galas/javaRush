package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String className = null;
        if (o.getClass().getSimpleName().equals("Cat"))
            className = "Кот";

        else if (o.getClass().getSimpleName().equals("Tiger"))
            className = "Тигр";

        else if (o.getClass().getSimpleName().equals("Lion"))
            className = "Лев";

        else if (o.getClass().getSimpleName().equals("Bull"))
            className = "Бык";

        else if (o.getClass().getSimpleName().equals("Cow"))
            className = "Корова";

        else if (o.getClass().getSimpleName().equals("Animal"))
            className = "Животное";

        return className;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
