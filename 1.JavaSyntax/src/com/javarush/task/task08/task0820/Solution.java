package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            Cat newAddCat = new Cat();
            result.add(newAddCat);
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>();

        for (int i = 0; i < 3; i++) {
            Dog newAddDog = new Dog();
            result.add(newAddDog);
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> pets = new HashSet<Object>();

        Iterator<Cat> catIterator = cats.iterator();
        while (catIterator.hasNext()){
            pets.add(catIterator.next());
        }


        Iterator<Dog> dogIterator = dogs.iterator();
        while (dogIterator.hasNext()){
            pets.add(dogIterator.next());
        }

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код

        Iterator<Object> petsIterator = pets.iterator();
        while (petsIterator.hasNext()){
            if (cats.contains(petsIterator.next()))
            petsIterator.remove();
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> petsIterator = pets.iterator();
        while (petsIterator.hasNext()){
            System.out.println(petsIterator.next());
        }

    }

    //напишите тут ваш код
    public static class Cat {

    }

    public static class Dog {

    }
}
