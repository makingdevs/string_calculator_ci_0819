package com.makingdevs;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGabrielMGA {

    public String computer(int number) {

        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";

        if (number % 3 == 0)
            return  "Fizz";

        if (number % 5 == 0)
            return "Buzz";

        return "";
    }

    public List<String> computer(List<Integer> numbers) {

        List<String> resultNumbersList = new ArrayList<>();

        if (!(numbers == null || numbers.isEmpty())) {
            for(int number : numbers) {
                if(number % 3 == 0 && number % 5 == 0){
                    resultNumbersList.add("FizzBuzz");
                } else if (number % 3 == 0) {
                    resultNumbersList.add("Fizz");
                } else if (number % 5 == 0) {
                    resultNumbersList.add("Buzz");
                } else
                    resultNumbersList.add(Integer.toString(number));
            }
        }

        return resultNumbersList;
    }

}
