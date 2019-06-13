package com.makingdevs;

import com.makingdevs.constants.Constants;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRafaelAvelar {

    public String compute(int entero) {

        if (entero % 3 == 0 && entero % 5 == 0) {
            return Constants.FIZZBUZZ_WORD;
        } else if (entero % 3 == 0) {
            return Constants.FIZZ_WORD;
        } else if (entero % 5 == 0) {
            return Constants.BUZZ_WORD;
        } else {
            return String.valueOf(entero);
        }
    }

    public List<String> compute(List<Integer> enterosList) {
        List<String> respuestaList = new ArrayList<>();

        if (enterosList != null && !enterosList.isEmpty()) {
            for (Integer entero : enterosList) {

                if (entero % 3 == 0 && entero % 5 == 0) {
                    respuestaList.add(Constants.FIZZBUZZ_WORD);
                } else if (entero % 3 == 0) {
                    respuestaList.add(Constants.FIZZ_WORD);
                } else if (entero % 5 == 0) {
                    respuestaList.add(Constants.BUZZ_WORD);
                } else {
                    respuestaList.add(String.valueOf(entero));
                }

            }
        }
        return respuestaList;
    }
}