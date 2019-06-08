package com.makingdevs;

public class StringCalculator {

    public int add(String numbers){
        if(numbers.equals("")){return 0;} 

        int suma = 0;
        String[] arrNumbers = numbers.split(",");
        if(arrNumbers.length > 1){
            for(String num : arrNumbers){
                suma += Integer.parseInt(num);
            }
            return suma;
        }else{
            return Integer.parseInt(numbers);
        }
        
    }
}