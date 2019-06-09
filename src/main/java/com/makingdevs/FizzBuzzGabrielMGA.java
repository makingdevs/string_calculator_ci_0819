package com.makingdevs;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGabrielMGA {

    public String computer(int number) {
        return calculateDivisibleNumber(number);
    }

    public List<String> computer(List<Integer> numbers) {

        List<String> resultNumbersList = new ArrayList<>();
        String result = "";

        if(areNotListValid(numbers)) return resultNumbersList;

        for(int number : numbers) {
            result = calculateDivisibleNumber(number);
            if(result.equals(""))
                resultNumbersList.add(Integer.toString(number));
            else
                resultNumbersList.add(result);
        }


        return resultNumbersList;
    }

    private String calculateDivisibleNumber(int number){

        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";

        if (number % 3 == 0)
            return  "Fizz";

        if (number % 5 == 0)
            return "Buzz";

        return "";
    }

    private boolean areNotListValid(List<Integer> numbers) {
        return numbers == null || numbers.isEmpty();
    }

}
