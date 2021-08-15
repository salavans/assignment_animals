package com.example;

class Bird extends Animal {
    public Bird(String sound) {
        this.sound = sound;
        setFlyBehaviour(new Flyer());
        setSingBehaviour(new Singer());
        setWalkBehaviour(new Walker());
    }
}

class Duck extends Bird {
    public Duck() {
        super(Sounds.DUCK);
        setSwimBehaviour(new Swimmer());
    }
}

class Chicken extends Bird {
    protected boolean isMale = false;

    public Chicken() {
        this(Sounds.CHICKEN);
    }

    protected Chicken(String sound) {
        super(sound);
        setFlyBehaviour(new FlyNoWay());
    }
}

// Rooster is a Male Chicken
class Rooster extends Chicken {
    public Rooster() {
        super(Sounds.ROOSETER);
        isMale = true;
    }
}

class Parrot extends Bird {
    Parrot(String sound) {
        super(sound);
    }
}