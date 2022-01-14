package com.techreturners.cats;

public class DomesticCat extends Animal implements Cat {


    @Override
    public String getSetting() {
        return AnimalType.domestic.toString();
    }

    @Override
    public int getAverageHeight() {
        return 23;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
