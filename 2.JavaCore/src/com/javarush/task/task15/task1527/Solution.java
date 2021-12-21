package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String[] parameters = url.substring(url.indexOf("?")+1).split("&");
        String stringValues = "";
        String objValue = "";

        for (String string:parameters) {

            //keep parameter's names in ole line
            if (string.contains("="))
            {
               String[] buffer = string.split("=");
               stringValues = stringValues + buffer[0] + " ";

               //find anf save obj value
               if (buffer[0].contains("obj"))
                   objValue = buffer[1];
            }
            else
               stringValues = stringValues + string + " ";
        }

        System.out.println(stringValues.trim());

        if (!objValue.equals("")){
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
