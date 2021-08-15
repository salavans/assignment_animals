package com.example;

interface FlyBehavior {
    public void fly();
}

class CanFly implements FlyBehavior {
    public void fly() {
        System.out.println(Constants.FLYING);
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
    }
}

interface SingBehavior {
    public void sing(String sound);
}

class Sing implements SingBehavior {
    public void sing(String sound) {
        System.out.println(sound);
    }
}

class Mute implements SingBehavior {
    public void sing(String sound) {
    }
}

class Bird extends Animal {
    protected String sound;
    FlyBehavior flyBehavior;
    SingBehavior singBehavior;

    public Bird(String sound) {
        this.sound = sound;
        flyBehavior = new NoFly();
        singBehavior = new Mute();
    }

    protected void setFlyBehaviour(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected void setSingBehaviour(SingBehavior singBehavior) {
        this.singBehavior = singBehavior;
    }

    void fly() {
        flyBehavior.fly();
    }

    void sing() {
        singBehavior.sing(sound);
    }
}

class Duck extends Bird {
    public Duck() {
        super(Sounds.DUCK);
        setFlyBehaviour(new CanFly());
        setSingBehaviour(new Sing());
    }

    void swim() {
        System.out.println(Constants.SWIMMING);
    }
}

class Chicken extends Bird {
    protected boolean isMale = false;

    public Chicken() {
        this(Sounds.CHICKEN);
    }

    protected Chicken(String sound) {
        super(sound);
        setSingBehaviour(new Sing());
    }
}

// Rooster is a Male Chicken
class Rooster extends Chicken {
    public Rooster() {
        super(Sounds.ROOSETER);
        isMale = true;
        // setSingBehaviour((s) -> System.out.println(Sounds.ROOSETER));
    }
}

class Parrot extends Bird {
    Parrot(String sound) {
        super(sound);
        setFlyBehaviour(new CanFly());
        setSingBehaviour(new Sing());
    }
}