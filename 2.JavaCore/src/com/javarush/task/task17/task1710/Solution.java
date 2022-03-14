package com.javarush.task.task17.task1710;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) {

        //напишите тут ваш код
        switch (args[0]){
            //create
            case ("-c"): {
                synchronized (allPeople) {
                    Date birthDate = null;
                    try {
                        birthDate = inputFormat.parse(args[3]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    if (args[2].equals("m") || args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1], birthDate));
                    } else if (args[2].equals("w") || args[2].equals("ж")) {
                        allPeople.add(Person.createFemale(args[1], birthDate));
                    }
                }
               // readPerson(allPeople.size()-1);
                System.out.println(allPeople.size()-1);


            }
            break;


            //read
            case ("-r"): {
                synchronized (allPeople) {
                    readPerson(Integer.parseInt(args[1]));
                }
            }
            break;


            //update
            case ("-u"):
                synchronized (allPeople)
                {
                    int id = Integer.parseInt(args[1]);
                    Date birthDate = null;
                    try {
                        birthDate = inputFormat.parse(args[4]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                    allPeople.get(id).setName(args[2]);

                    if (args[3].equals("m") || args[3].equals("м")){
                        allPeople.get(id).setSex(Sex.MALE);
                    }
                    else if (args[3].equals("w") || args[3].equals("ж")){
                        allPeople.get(id).setSex(Sex.FEMALE);
                    }

                    allPeople.get(id).setBirthDate(birthDate);
                }
                break;


            //delete
            case ("-d"):
                synchronized (allPeople){
                    int id = Integer.parseInt(args[1]);
                    allPeople.get(id).setBirthDate(null);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                }
                break;


        }

    }

    public static void readPerson(int id){
        if (allPeople.get(id).getSex().equals(Sex.MALE)){
            System.out.println(allPeople.get(id).getName() + " м " + outputFormat.format(allPeople.get(id).getBirthDate()));
        }
        else if  (allPeople.get(id).getSex().equals(Sex.MALE)){
            System.out.println(allPeople.get(id).getName() + " ж " + outputFormat.format(allPeople.get(id).getBirthDate()));
        }


    }
}
