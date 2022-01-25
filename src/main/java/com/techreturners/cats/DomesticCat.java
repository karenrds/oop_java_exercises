package com.techreturners.cats;

public class DomesticCat extends Animal implements Cat {

    public DomesticCat() {
        super(23,"Purrrrrrr");
    }

    @Override
    public String getSetting() {
        return AnimalType.domestic.toString();
    }
}
