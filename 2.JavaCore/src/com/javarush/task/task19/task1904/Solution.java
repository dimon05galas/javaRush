package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {
            String[] personData = fileScanner.nextLine().split(" ");
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = dateFormatter.parse(personData[3] + " " + personData[4] + " " + personData[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Person(personData[1], personData[2], personData[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
