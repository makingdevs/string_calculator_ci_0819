package com.makingdevs;

public class StringCalculator {

    public int add(String numbers){
        if(numbers == null){return 0;}

        numbers = numbers.replaceAll("\n",",");

        if(!validaNumbers(numbers)){
            return 0;
        }
                
        return sumaString(numbers); 
    }

    private boolean validaNumbers(String numbers){

        if(numbers.startsWith(",") 
        || numbers.endsWith(",")
        || numbers.contains(",,")
        || numbers.isEmpty()){
            return false;
        }
        
        return true;
    }
    
    private int sumaString(String numbers){
        int suma = 0;
        String[] arrayOfNumbers = numbers.split(",");
        if(arrayOfNumbers.length > 1){
            for(String number : arrayOfNumbers){
                suma += Integer.parseInt(number);
            }
            return suma;
        }else{
            suma = Integer.parseInt(numbers);
        }
        return suma;
    }
}