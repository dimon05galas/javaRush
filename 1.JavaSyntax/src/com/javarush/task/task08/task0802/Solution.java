package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Map<String, String> greenMap = new HashMap<String, String>();

        greenMap.put("арбуз","ягода");
        greenMap.put("банан","трава");
        greenMap.put("вишня","ягода");
        greenMap.put("груша","фрукт");
        greenMap.put("дыня","овощ");
        greenMap.put("ежевика","куст");
        greenMap.put("жень-шень","корень");
        greenMap.put("земляника","ягода");
        greenMap.put("ирис","цветок");
        greenMap.put("картофель","клубень");

        for (Map.Entry<String, String> pair: greenMap.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }

    }
}
