package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смиронов", dateFormat.parse("JULY 12 2011"));
        map.put("Федоров", dateFormat.parse("AUGUST 15 2010"));
        map.put("Иванов", dateFormat.parse("NOVEMBER 21 2009"));
        map.put("Петров", dateFormat.parse("DECEMBER 19 2008"));
        map.put("Алексеев", dateFormat.parse("FEBRUARY 3 2007"));
        map.put("Михайлов", dateFormat.parse("JUNE 14 2006"));
        map.put("Дмитриев", dateFormat.parse("JULY 18 2005"));
        map.put("Юрьев", dateFormat.parse("AUGUST 13 2004"));
        map.put("Александров", dateFormat.parse("SEPTEMBER 7 2003"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
           Map.Entry<String, Date> birthdayInfo = iterator.next();
           Date birthday = birthdayInfo.getValue();
           int month = birthday.getMonth();
            if (birthdayInfo.getValue().getMonth()>4 && birthdayInfo.getValue().getMonth()<8)
                iterator.remove();
        }

    }

    public static void main(String[] args) throws ParseException {
    }
}
