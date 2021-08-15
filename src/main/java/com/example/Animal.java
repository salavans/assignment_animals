package com.example;

abstract class Animal {
    private Flyable flyBehavior;
    private Singable singBehavior;
    private Walkable walkBehavior;
    private Swimmable swimBehavior;
    protected String sound;

    Animal(String sound) {
        this.sound = sound;
        flyBehavior = new FlyNoWay();
        singBehavior = new SingNoWay();
        walkBehavior = new WalkNoWay();
        swimBehavior = new SwimNoWay();
    }

    Animal() {
        this("");
    }

    protected final void setFlyBehaviour(Flyable flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected final void setSingBehaviour(Singable singBehavior) {
        this.singBehavior = singBehavior;
    }

    protected final void setWalkBehaviour(Walkable walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    protected final void setSwimBehaviour(Swimmable swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public Flyable getFlyBehaviour() {
        return flyBehavior;
    }

    public Singable getSingBehaviour() {
        return singBehavior;
    }

    public Walkable getWalkBehaviour() {
        return walkBehavior;
    }

    public Swimmable getSwimBehaviour() {
        return swimBehavior;
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
