package com.javarush.task.task19.task1902;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Адаптер
*/

public class AdapterFileOutputStream implements AmigoStringWriter {

    private FileOutputStream fileOutputStream;

    AdapterFileOutputStream(FileOutputStream fileOutputStream){
        this.fileOutputStream = fileOutputStream;
    }


    public static void main(String[] args) {

    }


    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
//        for (int i=0; i<s.length(); i++){
//            char toWrite = s.charAt(i);
//            fileOutputStream.write(toWrite);
//        }

    }

    @Override
    public void close() throws IOException {
        fileOutputStream.close();
    }
}

