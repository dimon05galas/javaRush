package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    int CountOfEggsPerMonth = 2;
    String country = Country.UKRAINE;
    @Override
    int getCountOfEggsPerMonth() {
        return this.CountOfEggsPerMonth;
    }

    String getDescription(){
        return super.getDescription()+" Моя страна - "+this.country+". Я несу "+this.CountOfEggsPerMonth+" яиц в месяц.";
    }
}
