package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        String parentClass = Thread.currentThread().getStackTrace()[2].getClassName();
        String parentMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(parentClass + ": "+ parentMethod + ": " + text);
    }
}
