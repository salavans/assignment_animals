package com.example;

class Bird extends Animal {
    public Bird(String sound) {
        this.sound = sound;
        setFlyBehaviour(new CanFly());
        setSingBehaviour(new CanSing());
        setWalkBehaviour(new CanWalk());
    }
}

class Duck extends Bird {
    public Duck() {
        super(Sounds.DUCK);
        setSwimBehaviour(new CanSwim());
    }
}

class Chicken extends Bird {
    protected boolean isMale = false;

    public Chicken() {
        this(Sounds.CHICKEN);
    }

    protected Chicken(String sound) {
        super(sound);
        setFlyBehaviour(new NoFly());
    }
}

// Rooster is a Male Chicken
class Rooster extends Chicken {
    public Rooster() {
        // super(Sounds.ROOSETER);
        isMale = true;
        setSingBehaviour((s) -> System.out.println(Sounds.ROOSETER));
    }
}

class Parrot extends Bird {
    Parrot(String sound) {
        super(sound);
    }
}