package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove{
        public default Double speed(){
            return null;
        };
    }

    interface CanFly extends CanMove{
        public default Double speed(CanFly flyDouble) {
            return null;
        }
    }
}