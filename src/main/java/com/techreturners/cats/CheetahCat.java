package com.techreturners.cats;

public class CheetahCat extends Animal implements Cat {

    @Override
    public String getSetting() {
        return AnimalType.wild.toString();
    }

    @Override
    public int getAverageHeight() {
        return 50;
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
