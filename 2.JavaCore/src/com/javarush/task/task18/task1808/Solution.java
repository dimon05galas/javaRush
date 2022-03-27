package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream file1InputStream = new FileInputStream(file1);
        FileOutputStream file2OutputStream = new FileOutputStream(file2);
        FileOutputStream file3OutputStream = new FileOutputStream(file3);


        if (file1InputStream.available()>0){
            int count2, count3;
            count2 = count3 = file1InputStream.available()/2;

            if(file1InputStream.available()%2==1)
                count2++;


            byte[] buffer2 = new byte[count2];
            file1InputStream.read(buffer2);
            file2OutputStream.write(buffer2, 0, count2);

            byte[] buffer3 = new byte[count3];
            file1InputStream.read(buffer3);
            file3OutputStream.write(buffer3, 0, count3);

        }

        file1InputStream.close();
        file2OutputStream.close();
        file3OutputStream.close();

        }

}
