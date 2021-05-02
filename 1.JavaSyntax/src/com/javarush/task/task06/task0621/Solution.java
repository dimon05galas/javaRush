package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);


        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather );

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null );


        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather );

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather );



        System.out.println(catGrandFather.toString());
        System.out.println(catGrandMother.toString());

        System.out.println(catFather.toString());
        System.out.println(catMother.toString());

        System.out.println(catSon.toString());
        System.out.println(catDaughter.toString());


    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {

            String catInfo = "The cat's name is " + name;
//            System.out.println(this.name + " мама " + this.mother.name);
            if (mother == null)
                catInfo = catInfo + ", no mother";
            else
                catInfo = catInfo + ", mother is " + mother.name;

      //      System.out.println(name + " папа " + father.name);

            if (father == null)
                catInfo = catInfo + ", no father";
            else
                catInfo = catInfo + ", father is " + father.name;
            return catInfo;
        }
    }

}
