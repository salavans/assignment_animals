package com.example;

import java.util.ArrayList;

enum FishSize {
    UNDEFINED, SMALL, LARGE
}

enum FishColor {
    UNDEFINED, GREY, ORANGE
}

class Fish extends Animal {
    protected FishSize size;
    protected FishColor color;

    Fish() {
        size = FishSize.UNDEFINED;
        color = FishColor.UNDEFINED;
    }

    void walk() {
    }

    void swim() {
        System.out.println(Constants.SWIMMING);
    }

    public FishSize getSize() {
        return size;
    }

    public FishColor getColor() {
        return color;
    }
}

class Clownfish extends Fish {
    private String jokeMessage;

    Clownfish() {
        size = FishSize.SMALL;
        color = FishColor.ORANGE;
    }

    public void setJokeMessage(String joke) {
        jokeMessage = joke;
    }

    public void makeJoke() {
        System.out.println(jokeMessage);
    }
}

class Shark extends Fish {
    private ArrayList<Fish> eatenFishList = new ArrayList<>();

    Shark() {
        size = FishSize.LARGE;
        color = FishColor.GREY;
    }

    public void eatFish(Fish fish) {
        eatenFishList.add(fish);
    }

    public int getTotalEatenFish() {
        return eatenFishList.size();
    }
}

class Dolphin {
    final Fish fish = new Fish();

    public void swim() {
        fish.swim();
    }
}