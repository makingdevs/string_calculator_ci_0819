package com.makingdevs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGabrielMGATest {

    @Test
    public void divisibleNumbersBetweenThree() {
        FizzBuzzGabrielMGA fzg = new FizzBuzzGabrielMGA();
        String result = fzg.computer(30);
        assertEquals("Fizz",result);
    }

    @Test
    public void divisibleNumbersBetweenFive() {
        FizzBuzzGabrielMGA fzg = new FizzBuzzGabrielMGA();
        String result = fzg.computer(20);
        assertEquals("Buzz",result);
    }
}
