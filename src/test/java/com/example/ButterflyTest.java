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
public class ButterflyTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void butterflyTest() {
        Butterfly bfly = new Butterfly(false);
        bfly.walk();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bfly.sing();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
        bfly.fly();
        Assert.assertEquals(Constants.FLYING, outputStreamCaptor.toString().trim());
    }

    @Test
    public void caterpillarTest() {
        Butterfly bfly = new Butterfly(true);
        bfly.walk();
        Assert.assertEquals(Constants.WALKING, outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        bfly.sing();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
        bfly.fly();
        Assert.assertEquals("", outputStreamCaptor.toString().trim());
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }
}
