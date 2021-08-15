package com.example;

interface Constants {
    String WALKING = "walking";
    String SWIMMING = "swimming";
    String FLYING = "flying";
}

interface Sounds {
    String CHICKEN = "Cluck, cluck";
    String ROOSETER = "Cock-a-doodle-doo";
    String DUCK = "Quack , quack";

}

abstract class Animal {
    void walk() {
        System.out.println(Constants.WALKING);
    }
}
