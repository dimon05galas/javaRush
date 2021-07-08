package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    int CountOfEggsPerMonth =3;
    String country = Country.MOLDOVA;
    @Override
    int getCountOfEggsPerMonth() {
        return this.CountOfEggsPerMonth;
    }

     String getDescription(){
        return super.getDescription() + " Моя страна - "+this.country+". Я несу "+this.CountOfEggsPerMonth+" яиц в месяц.";
    }
}
