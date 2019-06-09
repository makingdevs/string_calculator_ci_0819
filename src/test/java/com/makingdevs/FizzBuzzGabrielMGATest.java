package com.makingdevs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzGabrielMGATest {

    @Test
    public void divisibleNumbersBetweenThree() {
        FizzBuzzGabrielMGA fzg = new FizzBuzzGabrielMGA();
        String result = fzg.computer(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void divisibleNumbersBetweenFive() {
        FizzBuzzGabrielMGA fzg = new FizzBuzzGabrielMGA();
        String result = fzg.computer(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void divisibleNumbersBetweenThreeAndFive() {
        FizzBuzzGabrielMGA fzg = new FizzBuzzGabrielMGA();
        String result = fzg.computer(30);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void overloadDivisibleNumbers() {
        FizzBuzzGabrielMGA fzg = new FizzBuzzGabrielMGA();
        List<String> arrayEsperado = new ArrayList<>();
        arrayEsperado.add("1");
        arrayEsperado.add("2");
        arrayEsperado.add("Fizz");
        arrayEsperado.add("4");
        arrayEsperado.add("Buzz");
        arrayEsperado.add("Fizz");
        arrayEsperado.add("7");
        arrayEsperado.add("8");
        arrayEsperado.add("Fizz");
        arrayEsperado.add("Buzz");
        arrayEsperado.add("11");
        arrayEsperado.add("Fizz");
        arrayEsperado.add("13");
        arrayEsperado.add("14");
        arrayEsperado.add("FizzBuzz");

        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<=15; i++){
            numbers.add(i);
        }
        List<String> result = fzg.computer(numbers);
        assertEquals(arrayEsperado,result);
    }
}
