package com.makingdevs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzRolandTest {

    @Test
    public void divisibleThree() {
        FizzBuzzRoland fizzBuzzRoland = new FizzBuzzRoland();
        String result = fizzBuzzRoland.compute(3);
        assertEquals("Fizz", result);
        result = fizzBuzzRoland.compute(4);
        assertEquals("4", result);
        result = fizzBuzzRoland.compute(6);
        assertEquals("Fizz", result);
        result = fizzBuzzRoland.compute(9);
        assertEquals("Fizz", result);
        result = fizzBuzzRoland.compute(7);
        assertEquals("7", result);
        result = fizzBuzzRoland.compute(12);
        assertEquals("Fizz", result);
        result = fizzBuzzRoland.compute(8);
        assertEquals("8", result);
    }

    @Test
    public void divisibleFive() {
        FizzBuzzRoland fizzBuzzRoland = new FizzBuzzRoland();
        String result = fizzBuzzRoland.compute(1);
        assertEquals("1", result);
        result = fizzBuzzRoland.compute(4);
        assertEquals("4", result);
        result = fizzBuzzRoland.compute(5);
        assertEquals("Buzz", result);
        result = fizzBuzzRoland.compute(7);
        assertEquals("7", result);
        result = fizzBuzzRoland.compute(8);
        assertEquals("8", result);
        result = fizzBuzzRoland.compute(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void divisibleNumbersThreeAndFive() {
        FizzBuzzRoland fizzBuzzRoland = new FizzBuzzRoland();
        String result = fizzBuzzRoland.compute(30);
        assertEquals("FizzBuzz", result);
        result = fizzBuzzRoland.compute(15);
        assertEquals("FizzBuzz", result);
        result = fizzBuzzRoland.compute(99);
        assertEquals("Fizz", result);
        result = fizzBuzzRoland.compute(100);
        assertEquals("Buzz", result);
        result = fizzBuzzRoland.compute(45);
        assertEquals("FizzBuzz", result);
        result = fizzBuzzRoland.compute(80);
        assertEquals("Buzz", result);
    }
    @Test
    public void Arraytest() {
        FizzBuzzRoland fizzBuzzRoland = new FizzBuzzRoland();
        List<Integer> TestArray = new ArrayList<>();
        TestArray.add(1);
        TestArray.add(10);
        TestArray.add(12);
        TestArray.add(22);
        TestArray.add(33);
        TestArray.add(55);
        TestArray.add(15);
        TestArray.add(30);
        TestArray.add(88);
        TestArray.add(100);
        List<String> result = fizzBuzzRoland.compute(TestArray);
        List<String> expectedArray = Arrays.asList("1","Buzz","Fizz","22","Fizz","Buzz","FizzBuzz","FizzBuzz","88","Buzz");
        assertEquals(expectedArray, result);
    }
}
