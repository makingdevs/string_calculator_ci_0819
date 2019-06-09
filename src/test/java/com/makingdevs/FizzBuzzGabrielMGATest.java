package com.makingdevs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGabrielMGATest {

    @Test
    public void divisibleNumbersBetweenThree() {
        FizzBuzzGabrielMGA fzg = new FizzBuzzGabrielMGA();
        String result = fzg.computer(3);
        assertEquals("Fizz",result);
    }
}
