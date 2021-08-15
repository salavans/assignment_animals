package com.example;

import java.util.*;

public class App {
    static long getWalkableAnimalCount(List<Animal> animals) {
        long count = animals.stream().filter(
                (a) -> a.getWalkBehaviour() != null ? ((a.getWalkBehaviour() instanceof NoWalk) ? false : true) : false)
                .count();
        return count;
    }

    static long getFlyableAnimalCount(List<Animal> animals) {
        long count = animals.stream().filter(
                (a) -> a.getFlyBehaviour() != null ? ((a.getFlyBehaviour() instanceof NoFly) ? false : true) : false)
                .count();
        return count;
    }

    static long getSingableAnimalCount(List<Animal> animals) {
        long count = animals.stream().peek(a -> a.sing()).filter(
                (a) -> a.getSingBehaviour() != null ? ((a.getSingBehaviour() instanceof Mute) ? false : true) : false)
                .count();
        return count;
    }

    static long getSwimableAnimalCount(List<Animal> animals) {
        long count = animals.stream().filter(
                (a) -> a.getSwimBehaviour() != null ? ((a.getSwimBehaviour() instanceof NoSwim) ? false : true) : false)
                .count();
        return count;
    }

    public static void main(String[] args) {
        Animal[] animals = { new Duck(), new Chicken(), new Rooster(), new Parrot("ring ring"), new Clownfish(),
                new Shark(), new Dolphin(), new Butterfly(false), new Butterfly(true) };
        System.out.println("Walkable animal count:" + getWalkableAnimalCount(Arrays.asList(animals)));
        System.out.println("Flyable animal count:" + getFlyableAnimalCount(Arrays.asList(animals)));
        System.out.println("Swimmable animal count:" + getSwimableAnimalCount(Arrays.asList(animals)));
        System.out.println("Singable animal count:" + getSingableAnimalCount(Arrays.asList(animals)));
    }
}
