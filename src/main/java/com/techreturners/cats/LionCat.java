package com.techreturners.cats;

public class LionCat extends Animal implements Cat {
    @Override
    public String getSetting() {
        return AnimalType.wild.toString();
    }

    @Override
    public int getAverageHeight() {
        return 1100;
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
