package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) {
        switch (args[0]){

            case "-c":

                synchronized (allPeople){
                    int count = (args.length-1)/3;

                    for (int i=0; i<count; i++){
                        int startInd = i*3;

                        Date birthDate = null;
                        try {
                            birthDate = inputDateFormat.parse(args[startInd+3]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        if (args[startInd+2].equals("м") || args[startInd+2].equals("m")){
                            allPeople.add(Person.createMale(args[startInd+1], birthDate));
                        }
                        else if (args[startInd+2].equals("ж") || args[startInd+2].equals("f"))
                            allPeople.add(Person.createFemale(args[startInd+1], birthDate));
                        System.out.println(allPeople.size()-1);
                    }
                }
                break;


            case "-u":
                synchronized (allPeople){
                    int count = (args.length-1)/4;
                    for (int i=0; i<count; i++){
                        int startInd = i*4;

                        allPeople.get(Integer.parseInt(args[startInd+1])).setName(args[startInd+2]);

                        if (args[startInd+3].equals("м") || args[startInd+3].equals("m"))
                            allPeople.get(Integer.parseInt(args[startInd+1])).setSex(Sex.MALE);
                        else if (args[startInd+3].equals("ж") || args[startInd+3].equals("f"))
                            allPeople.get(Integer.parseInt(args[startInd+1])).setSex(Sex.FEMALE);

                        try {
                            allPeople.get(Integer.parseInt(args[startInd+1])).setBirthDate(inputDateFormat.parse(args[startInd+4]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                    }
                }
                break;

            case "-d":
                synchronized (allPeople){
                    for (int i=0; i<args.length-1; i++){
                        allPeople.get(Integer.parseInt(args[1+i])).setName(null);
                        allPeople.get(Integer.parseInt(args[1+i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[1+i])).setBirthDate(null);
                    }

                }
                break;

            case "-i":
                synchronized (allPeople){
                    for (int i=0; i<args.length-1; i++){
                        String sex = null;
                        if (allPeople.get(Integer.parseInt(args[1+i])).getSex().equals(Sex.MALE))
                            sex = "м";
                        else if (allPeople.get(Integer.parseInt(args[1+i])).getSex().equals(Sex.FEMALE))
                            sex = "ж";
                        System.out.println(allPeople.get(Integer.parseInt(args[1+i])).getName() + " " + sex + " " + outputDateFormat.format(allPeople.get(Integer.parseInt(args[1+i])).getBirthDate()));
                    }
                }



        }


    }
}
