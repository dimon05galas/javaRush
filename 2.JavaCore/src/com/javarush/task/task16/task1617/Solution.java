package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

import java.util.Date;

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }
        public void run() {
            //add your code here - добавь код тут
            Date startTime = new Date();

            while(numSeconds>0){
                System.out.print(numSeconds+ " ");
                numSeconds--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Date endTime = new Date();
            if (endTime.getTime()-startTime.getTime()<3500)
                System.out.print("Марш!");
            else
                System.out.print("Прервано!");


        }
    }
}
