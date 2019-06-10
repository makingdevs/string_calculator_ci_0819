package com.makingdevs;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGabrielMGA {

    public String computer(int number) {
        return calculateDivisible(number);
    }

    public List<String> computer(List<Integer> numbers) {

        List<String> resultNumbersList = new ArrayList<>();
        String result = "";

        if(areNotListValid(numbers)) return resultNumbersList;

        for(int number : numbers) {
            result = calculateDivisible(number);
            resultNumbersList.add(result);
        }
        
        return resultNumbersList;
    }

    private String calculateDivisible(int number){

        if(number % 15 == 0)
            return "FizzBuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";

        return Integer.toString(number);
    }

    private boolean areNotListValid(List<Integer> numbers) {
        return numbers == null || numbers.isEmpty();
    }

}
