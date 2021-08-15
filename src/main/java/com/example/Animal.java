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

class CanFly implements Flyable {
    public void fly() {
        System.out.println(Constants.FLYING);
    }
}

class NoFly implements Flyable {
    public void fly() {
    }
}

class CanSing implements Singable {
    public void sing(String sound) {
        System.out.println(sound);
    }
}

class Mute implements Singable {
    public void sing(String sound) {
    }
}

class CanWalk implements Walkable {
    public void walk() {
        System.out.println(Constants.WALKING);
    }
}

class NoWalk implements Walkable {
    public void walk() {
    }
}

class CanSwim implements Swimmable {
    public void swim() {
        System.out.println(Constants.SWIMMING);
    }
}

class NoSwim implements Swimmable {
    public void swim() {
    }
}

abstract class Animal {
    Flyable flyBehavior;
    Singable singBehavior;
    Walkable walkBehavior;
    Swimmable swimBehavior;
    protected String sound;

    Animal(String sound) {
        this.sound = sound;
        flyBehavior = new NoFly();
        singBehavior = new Mute();
        walkBehavior = new NoWalk();
        swimBehavior = new NoSwim();
    }

    Animal() {
        this("");
    }

    protected void setFlyBehaviour(Flyable flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected void setSingBehaviour(Singable singBehavior) {
        this.singBehavior = singBehavior;
    }

    protected void setWalkBehaviour(Walkable walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    protected void setSwimBehaviour(Swimmable swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    void fly() {
        flyBehavior.fly();
    }

    void sing() {
        singBehavior.sing(sound);
    }

    void walk() {
        walkBehavior.walk();
    }

    void swim() {
        swimBehavior.swim();
    }
}
