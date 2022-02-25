package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
       ImageReader newReader = null;


       if (imageTypes == ImageTypes.PNG){
            newReader = new PngReader();
        }
       else if (imageTypes == ImageTypes.BMP) {
           newReader = new BmpReader();
        }
        else if (imageTypes == ImageTypes.JPG){
            newReader = new JpgReader();
        }
        else
        {
            throw  new IllegalArgumentException("Неизвестный тип картинки");
        }

        return newReader;
    }
}
