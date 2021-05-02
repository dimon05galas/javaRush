package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputtedString = reader.readLine();
        return inputtedString;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputtedInt = Integer.parseInt(reader.readLine());
        return inputtedInt;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double inputtedDouble = Double.parseDouble(reader.readLine());
        return inputtedDouble;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean value = Boolean.parseBoolean(reader.readLine());
        Boolean result = null;

        if (value==true)
            result =  true;
        else if (value == false)
            result = false;
        return result;

        /*
        String value = reader.readLine();
        Boolean result = null;

        if (value=="true")
            result =  true;
        else if (value == "false")
            result = false;
        return result;
        */
        }

    public static void main(String[] args) throws Exception {

    }
}
