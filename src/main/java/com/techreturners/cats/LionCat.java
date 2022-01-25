package com.techreturners.cats;

public class LionCat extends Animal implements Cat {
    public LionCat() {
        super(1100,"Roar!!!!");
    }

    @Override
    public String getSetting() {
        return AnimalType.wild.toString();
    }
}
