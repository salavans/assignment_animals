package com.example;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FishTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void fishTest() {
        Fish fish = new Fish();
        fish.walk();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        fish.swim();
        Assert.assertEquals(Constants.SWIMMING, outputStreamCaptor.toString().trim());
    }

    @Test
    public void clownFishTest() {
        Fish fish = new Clownfish();
        fish.walk();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        fish.swim();
        Assert.assertEquals(Constants.SWIMMING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        Assert.assertEquals(FishColor.ORANGE, fish.getColor());
        Assert.assertEquals(FishSize.SMALL, fish.getSize());
        Assert.assertTrue(fish instanceof Clownfish);
        String joke = "funny";
        Clownfish clownfish = (Clownfish) fish;
        clownfish.setJokeMessage(joke);
        clownfish.makeJoke();
        Assert.assertEquals(joke, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

    }

    @Test
    public void sharkTest() {
        Fish fish = new Shark();
        fish.walk();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        fish.swim();
        Assert.assertEquals(Constants.SWIMMING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        Assert.assertEquals(FishColor.GREY, fish.getColor());
        Assert.assertEquals(FishSize.LARGE, fish.getSize());
        Assert.assertTrue(fish instanceof Shark);
        Shark shark = (Shark) fish;
        shark.eatFish(new Fish());
        shark.eatFish(new Fish());
        Assert.assertEquals(2, shark.getTotalEatenFish());

    }

    @Test
    public void dolphinTest() {
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        Assert.assertEquals(Constants.SWIMMING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }
}
