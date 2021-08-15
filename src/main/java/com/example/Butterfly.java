package com.example;

class Butterfly extends Animal {
    Butterfly(boolean isCaterpillar) {
        if (isCaterpillar) {
            setWalkBehaviour(new CanWalk());
        } else {
            setFlyBehaviour(new CanFly());
        }
    }
}
