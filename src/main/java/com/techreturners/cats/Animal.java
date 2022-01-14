package com.techreturners.cats;

public abstract class Animal {
    protected boolean isSleeping = false;
    protected int height;
    protected AnimalType animalType;

    public void goToSleep() {
        isSleeping = true;
    }

    public void wakeUp() {
        isSleeping = false;
    }

    public boolean isAsleep() {
        return isSleeping;
    }
}

enum AnimalType {
    domestic, wild
}