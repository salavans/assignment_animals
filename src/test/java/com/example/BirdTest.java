package com.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BirdTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void birdTest() {
        Bird bird = new Bird("");
        bird.walk();
        Assert.assertEquals(Constants.WALKING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.sing();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
        bird.fly();
        Assert.assertEquals(Constants.FLYING, outputStreamCaptor.toString().trim());
    }

    @Test
    public void duckTest() {
        Bird bird = new Duck();
        bird.walk();
        Assert.assertEquals(Constants.WALKING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.sing();
        Assert.assertEquals(Sounds.DUCK, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.fly();
        Assert.assertEquals(Constants.FLYING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        Assert.assertTrue(bird instanceof Duck);
        Duck duck = (Duck) bird;
        duck.swim();
        Assert.assertEquals(Constants.SWIMMING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();

    }

    @Test
    public void chickenTest() {
        Bird bird = new Chicken();
        bird.walk();
        Assert.assertEquals(Constants.WALKING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.sing();
        Assert.assertEquals(Sounds.CHICKEN, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.fly();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    public void roosterTest() {
        Bird bird = new Rooster();
        bird.walk();
        Assert.assertEquals(Constants.WALKING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.sing();
        Assert.assertEquals(Sounds.ROOSETER, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.fly();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    public void parrotTest() {
        Bird bird = new Parrot("Woof, woof");
        bird.walk();
        Assert.assertEquals(Constants.WALKING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.sing();
        Assert.assertEquals("Woof, woof", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bird.fly();
        Assert.assertEquals(Constants.FLYING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        Bird parrot2 = new Parrot("Cock-a-doodle-doo");
        parrot2.sing();
        Assert.assertEquals("Cock-a-doodle-doo", outputStreamCaptor.toString().trim());
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }
}
