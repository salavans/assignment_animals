package com.example;

import java.util.ResourceBundle;

interface Constants {
    ResourceBundle rb = ResourceBundle.getBundle("com.example.animal");
    String WALKING = rb.getString("walking");
    String SWIMMING = rb.getString("swimming");
    String FLYING = rb.getString("flying");
}

interface Sounds {
    ResourceBundle rb = ResourceBundle.getBundle("com.example.animal");
    String CHICKEN = rb.getString("chicken_sound");// "Cluck, cluck";
    String ROOSETER = rb.getString("rooster_sound");// "Cock-a-doodle-doo";
    String DUCK = rb.getString("duck_sound");// "Quack , quack";
}

interface Flyable {
    public void fly();
}

interface Singable {
    public void sing(String sound);
}

interface Walkable {
    public void walk();
}

interface Swimmable {
    public void swim();
}

class Flyer implements Flyable {
    public void fly() {
        System.out.println(Constants.FLYING);
    }
}

class FlyNoWay implements Flyable {
    public void fly() {
    }
}

class Singer implements Singable {
    public void sing(String sound) {
        System.out.println(sound);
    }
}

class SingNoWay implements Singable {
    public void sing(String sound) {
    }
}

class Walker implements Walkable {
    public void walk() {
        System.out.println(Constants.WALKING);
    }
}

class WalkNoWay implements Walkable {
    public void walk() {
    }
}

class Swimmer implements Swimmable {
    public void swim() {
        System.out.println(Constants.SWIMMING);
    }
}

class SwimNoWay implements Swimmable {
    public void swim() {
    }
}
