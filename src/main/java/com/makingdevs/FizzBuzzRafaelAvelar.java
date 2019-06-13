package com.makingdevs;

public class FizzBuzzRafaelAvelar {

    public String compute(int entero){

        if(entero % 3 == 0){
            return "Fizz";
        }else if(entero % 5 == 0){
            return "Buzz";
        }else{
            return String.valueOf(entero);
        }
    }
}