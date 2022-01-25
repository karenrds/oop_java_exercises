package com.techreturners.cats;

public class CheetahCat extends Animal implements Cat {
    public CheetahCat() {
        super(50,"Zzzzzzz");
    }

    @Override
    public String getSetting() {
        return AnimalType.wild.toString();
    }
}
