package com.makingdevs;

import com.makingdevs.constants.Constants;

public class FizzBuzzRafaelAvelar {

    public String compute(int entero){

        if(entero % 3 == 0 && entero % 5 == 0){
            return Constants.FIZZBUZZ_WORD;
        }else if(entero % 3 == 0){
            return Constants.FIZZ_WORD;
        }else if(entero % 5 == 0){
            return Constants.BUZZ_WORD;
        }else{
            return String.valueOf(entero);
        }
    }
}