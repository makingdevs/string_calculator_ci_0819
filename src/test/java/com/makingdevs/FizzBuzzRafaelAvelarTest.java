package com.makingdevs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzRafaelAvelarTest {

    private static final String FIZZ_WORD = "Fizz";
    private static final String FIZZBUZZ_WORD = "FizzBuzz";

    @Test
    public void divideEntre3RegresaFizzTest(){
        FizzBuzzRafaelAvelar fizzRaff = new FizzBuzzRafaelAvelar();
        String resultado = fizzRaff.compute(3);
        assertEquals(FIZZ_WORD, resultado);
        assertEquals("1", fizzRaff.compute(1));
        assertEquals("2", fizzRaff.compute(2));
        assertEquals(FIZZ_WORD, fizzRaff.compute(3));
        assertEquals("4", fizzRaff.compute(4));
        assertEquals("5", fizzRaff.compute(5));
        assertEquals(FIZZ_WORD, fizzRaff.compute(6));
        assertEquals("7", fizzRaff.compute(7));
        assertEquals("8", fizzRaff.compute(8));
        assertEquals(FIZZ_WORD, fizzRaff.compute(9));
    }
}