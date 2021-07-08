package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    int CountOfEggsPerMonth =1;
    String country = Country.RUSSIA;
    @Override
    int getCountOfEggsPerMonth() {
        return this.CountOfEggsPerMonth;
    }

    String getDescription(){
        return super.getDescription() + " Моя страна - "+this.country+". Я несу "+this.CountOfEggsPerMonth+" яиц в месяц.";
    }
}
