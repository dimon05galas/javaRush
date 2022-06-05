package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));

        reader.close();

        List<String> lines1 = new ArrayList<>();
        List<String> lines2 = new ArrayList<>();

        while (file1.ready()){
            lines1.add(file1.readLine());
        }
        while (file2.ready()){
            lines2.add(file2.readLine());
        }
        file1.close();
        file2.close();

        int line1Index = 0;
        int line2Index = 0;


        while (line1Index<lines1.size() && line2Index<lines2.size()){
            if (lines1.get(line1Index).equals(lines2.get(line2Index))) {
                lines.add(new LineItem(Type.SAME, lines1.get(line1Index)));
                line1Index++;
                line2Index++;
            }
            else{
                if (lines1.get(line1Index+1).equals(lines2.get(line2Index))) {
                    lines.add(new LineItem(Type.REMOVED, lines1.get(line1Index)));
                    line1Index++;
                }
                else if (!lines1.get(line1Index+1).equals(lines2.get(line2Index))) {
                    lines.add(new LineItem(Type.ADDED, lines2.get(line2Index)));
                    line2Index++;
                }
            }
        }

        if ((lines1.size()-line1Index)==1 && (lines2.size()-line2Index)==0){
            lines.add(new LineItem(Type.REMOVED, lines1.get(line1Index)));
        }
        else if ((lines1.size()-line1Index)==0 && (lines2.size()-line2Index)==1){
            lines.add(new LineItem(Type.ADDED, lines2.get(line2Index)));
        }

    }



    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
