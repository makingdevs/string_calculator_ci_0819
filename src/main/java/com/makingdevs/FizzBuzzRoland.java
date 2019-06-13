package com.makingdevs;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRoland {

    public String compute(int number) {
        if((number % 3 == 0) && (number % 3 == 0)) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return String.valueOf(number);
      
    }

    public List<String> compute(List<Integer> numbersList) {
        List<String> respuestaList = new ArrayList<>();
        return respuestaList;
    }
}