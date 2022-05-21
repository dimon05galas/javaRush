package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();


        PrintStream defaultConsole = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        testString.printSomething();
        System.setOut(defaultConsole);

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(outputStream.toByteArray());
        fileOutputStream.close();

        System.out.println(outputStream.toString());



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

