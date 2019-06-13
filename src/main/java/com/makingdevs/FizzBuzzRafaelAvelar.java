package com.makingdevs;

public class FizzBuzzRafaelAvelar {

    private static final String FIZZ_WORD = "Fizz";
    private static final String BUZZ_WORD = "Buzz";
    private static final String FIZZBUZZ_WORD = "FizBuzz";

    public String compute(int entero){

        if(entero % 3 == 0 && entero % 5 == 0){
            return FIZZBUZZ_WORD;
        }else if(entero % 3 == 0){
            return FIZZ_WORD;
        }else if(entero % 5 == 0){
            return BUZZ_WORD;
        }else{
            return String.valueOf(entero);
        }
    }
}