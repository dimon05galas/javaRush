package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    int CountOfEggsPerMonth =4;
    String country = Country.BELARUS;
    @Override
    int getCountOfEggsPerMonth() {
        return this.CountOfEggsPerMonth;
    }
    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - "+this.country+". Я несу "+this.CountOfEggsPerMonth+" яиц в месяц.";
    }
}
