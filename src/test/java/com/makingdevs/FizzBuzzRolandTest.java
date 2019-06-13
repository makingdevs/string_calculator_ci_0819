package com.makingdevs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzRolandTest {

    @Test
    public void divisibleThree() {
        FizzBuzzRoland fzg = new FizzBuzzRoland();
        String result = fzg.compute(3);
        assertEquals("Fizz", result);
        result = fzg.compute(4);
        assertEquals("4", result);
        result = fzg.compute(6);
        assertEquals("Fizz", result);
        result = fzg.compute(9);
        assertEquals("Fizz", result);
        result = fzg.compute(7);
        assertEquals("7", result);
        result = fzg.compute(12);
        assertEquals("Fizz", result);
        result = fzg.compute(8);
        assertEquals("8", result);
    }

    @Test
    public void divisibleFive() {
        FizzBuzzRoland fzg = new FizzBuzzRoland();
        String result = fzg.compute(1);
        assertEquals("1", result);
        result = fzg.compute(4);
        assertEquals("4", result);
        result = fzg.compute(5);
        assertEquals("Buzz", result);
        result = fzg.compute(7);
        assertEquals("7", result);
        result = fzg.compute(8);
        assertEquals("8", result);
        result = fzg.compute(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void divisibleNumbersThreeAndFive() {
        FizzBuzzRoland fzg = new FizzBuzzRoland();
        String result = fzg.compute(30);
        assertEquals("FizzBuzz", result);
        result = fzg.compute(15);
        assertEquals("FizzBuzz", result);
        result = fzg.compute(99);
        assertEquals("Fizz", result);
        result = fzg.compute(100);
        assertEquals("Buzz", result);
        result = fzg.compute(45);
        assertEquals("FizzBuzz", result);
        result = fzg.compute(80);
        assertEquals("Buzz", result);
    }
}
