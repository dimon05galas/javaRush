package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultConsole = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        testString.printSomething();
        System.setOut(defaultConsole);

        String[] parsedTask = outputStream.toString().split("\\s");
        int a = Integer.parseInt(parsedTask[0]);
        int b = Integer.parseInt(parsedTask[2]);
       Integer result = null;

        switch (parsedTask[1]){
            case("+"): {
                result = a + b;
                break;
            }
            case("-"): {
                result = a - b;
                break;
            }
            case("*"): {
                result = a * b;
                break;
            }
        }

        StringBuilder task = new StringBuilder();
        for (String s: parsedTask){
            task.append(s + " ");
        }
        task.append(result.toString());

        System.out.print(task.toString());


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

