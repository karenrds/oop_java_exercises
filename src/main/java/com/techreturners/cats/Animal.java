package com.techreturners.cats;

public abstract class Animal {
    protected boolean isSleeping = false;
    protected int height;
    protected String eat;
    protected AnimalType animalType;

    public Animal(int averageHeight, String eat) {
        this.height = averageHeight;
        this.eat = eat;
    }

    public void goToSleep() {
        isSleeping = true;
    }

    public void wakeUp() {
        isSleeping = false;
    }

    public boolean isAsleep() {
        return isSleeping;
    }

    public int getAverageHeight() {
        return this.height;
    }

    public String eat() {
        return this.eat;
    }
}

enum AnimalType {
    domestic, wild
}