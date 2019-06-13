package com.makingdevs;

import static org.junit.Assert.assertEquals;

import com.makingdevs.constants.Constants;
import org.junit.Test;

public class FizzBuzzRafaelAvelarTest {

    @Test
    public void divideEntre3RegresaFizzTest(){
        FizzBuzzRafaelAvelar fizzRaff = new FizzBuzzRafaelAvelar();
        String resultado = fizzRaff.compute(3);
        assertEquals(Constants.FIZZ_WORD, resultado);
        assertEquals("1", fizzRaff.compute(1));
        assertEquals("2", fizzRaff.compute(2));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(3));
        assertEquals("4", fizzRaff.compute(4));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(6));
        assertEquals("7", fizzRaff.compute(7));
        assertEquals("8", fizzRaff.compute(8));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(9));
    }

    @Test
    public void divideEntre5RegresaBuzzTest(){
        FizzBuzzRafaelAvelar fizzRaff = new FizzBuzzRafaelAvelar();
        String resultado = fizzRaff.compute(5);
        assertEquals(Constants.BUZZ_WORD, resultado);
        assertEquals("1", fizzRaff.compute(1));
        assertEquals("2", fizzRaff.compute(2));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(3));
        assertEquals("4", fizzRaff.compute(4));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(5));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(6));
        assertEquals("7", fizzRaff.compute(7));
        assertEquals("8", fizzRaff.compute(8));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(9));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(10));
        //assertEquals(FIZZBUZZ_WORD, fizzRaff.compute(15));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(20));
    }

    @Test
    public void divideEntre3y5RegresaFizzBuzzTest(){
        FizzBuzzRafaelAvelar fizzRaff = new FizzBuzzRafaelAvelar();
        String resultado = fizzRaff.compute(5);
        assertEquals(Constants.BUZZ_WORD, resultado);
        assertEquals("1", fizzRaff.compute(1));
        assertEquals("2", fizzRaff.compute(2));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(3));
        assertEquals("4", fizzRaff.compute(4));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(5));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(6));
        assertEquals("7", fizzRaff.compute(7));
        assertEquals("8", fizzRaff.compute(8));
        assertEquals(Constants.FIZZ_WORD, fizzRaff.compute(9));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(10));
        assertEquals(Constants.FIZZBUZZ_WORD, fizzRaff.compute(15));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(20));
        assertEquals(Constants.FIZZBUZZ_WORD, fizzRaff.compute(30));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(40));
        assertEquals(Constants.BUZZ_WORD, fizzRaff.compute(50));
        assertEquals(Constants.FIZZBUZZ_WORD, fizzRaff.compute(60));
    }
}