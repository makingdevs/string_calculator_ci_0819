package com.makingdevs;

public class FizzBuzzRafaelAvelar {

    public String compute(int entero){

        if(entero%3 == 0){
            return "Fizz";
        }else{
            return String.valueOf(entero);
        }
    }
}