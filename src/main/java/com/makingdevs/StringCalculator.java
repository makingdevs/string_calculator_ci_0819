package com.makingdevs;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.equals("")){return 0;} 

        int suma = 0;
        String[] arrayOfNumbers = numbers.split(",");
        if(arrayOfNumbers.length > 1){
            for(String number : arrayOfNumbers){
                suma += Integer.parseInt(number);
            }
            return suma;
        }else{
            return Integer.parseInt(numbers);
        }
        
    }
}