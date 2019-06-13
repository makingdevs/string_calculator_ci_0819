package com.makingdevs;

import com.makingdevs.constants.Constants;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRafaelAvelar {

    public String compute(int entero) {
        return obtienePalabra(entero);
    }

    public List<String> compute(List<Integer> enterosList) {
        List<String> respuestaList = new ArrayList<>();

        if (enterosList != null && !enterosList.isEmpty()) {
            for (Integer entero : enterosList) {
                respuestaList.add(obtienePalabra(entero));
            }
        }
        return respuestaList;
    }


    private String obtienePalabra(int entero) {

        if (entero % 3 == 0 && entero % 5 == 0) return Constants.FIZZBUZZ_WORD;
        if (entero % 3 == 0) return Constants.FIZZ_WORD;
        if (entero % 5 == 0) return Constants.BUZZ_WORD;

        return String.valueOf(entero);
    }
}