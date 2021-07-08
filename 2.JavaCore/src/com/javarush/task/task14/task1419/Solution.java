package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.SocketTimeoutException;
import java.time.DateTimeException;
import java.time.zone.ZoneRulesException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }

        //System.out.println(exceptions.size());
    }

    private static void initExceptions() {   //the first exception

        //ArithmeticException
        try {
            float i = 1 / 0;
        } catch (ArithmeticException  e) {
            exceptions.add(e);
        }

        //ArrayIndexOutOfBoundsException
        try{
            int checkExceptions[] = new int[5];
            int a = checkExceptions[5];
        } catch (ArrayIndexOutOfBoundsException e){
            exceptions.add(e);
        }

        //FileNotFoundException
        try{
            FileReader reader = new FileReader("nofile.txt");
        } catch (FileNotFoundException e){
            exceptions.add(e);
        }

        //NegativeArraySizeException
        try{
            int checkExceptions[] = new int[-4];
        } catch (NegativeArraySizeException  e){
            exceptions.add(e);
        }

        //NullPointerException
        try{
            Integer nullInt = null;
            Integer a = 3 / nullInt;
        } catch (NullPointerException  e){
            exceptions.add(e);
        }

        //NumberFormatException
        try{
            String word = "myWord";
            Integer i = Integer.parseInt(word);
        } catch (NumberFormatException  e){
            exceptions.add(e);
        }

        //ClassCastException
        try {
            Object x = new Integer(0);
            System.out.println((String)x);
        } catch (ClassCastException  e) {
            exceptions.add(e);
        }

        //ArrayStoreException
        try {
            Object o[] = new String[5];
            o[2] = new Integer(200);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        //StringIndexOutOfBoundsException
        try {
            String s = "World!";
            s.charAt(10);
        }
        catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        //CloneNotSupportedException
        try {
            new Solution().clone();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }


    }
}
