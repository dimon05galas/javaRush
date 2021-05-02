package com.javarush.task.task08.task0807;

import java.util.ArrayList;
import java.util.LinkedList;

/* 
LinkedList и ArrayList
*/

public class Solution {
    public static Object createArrayList() {
        //напишите тут ваш код
        //ArrayList<String> arrayList = new ArrayList<String>();
        /*
        arrayList.add("firstLineArray");
        arrayList.add("secondLineArray");
        arrayList.add("thirdLineArray");
        arrayList.add("fourthLineArray");*/
        return new ArrayList<String>();
    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        //LinkedList<String> linkedList = new LinkedList<String>();
        /*
        linkedList.add("firstLineLinked");
        linkedList.add("secondLineLinked");
        linkedList.add("thirdLineLinked");
        linkedList.add("fourthLineLinked");*/
        return new LinkedList<String>();

    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = (ArrayList<String>) createArrayList();
        LinkedList<String> linkedList = (LinkedList<String>) createLinkedList();

    }
}
