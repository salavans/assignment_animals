package com.example;

class Butterfly extends Animal {
    Butterfly(boolean isCaterpillar) {
        if (isCaterpillar) {
            setWalkBehaviour(new Walker());
        } else {
            setFlyBehaviour(new Flyer());
        }
    }
}
