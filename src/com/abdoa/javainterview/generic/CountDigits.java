package com.abdoa.javainterview.generic;

public class CountDigits {

    public static void main(String[] args) {
        int number = 12345678;

        String numberString = Integer.toString(number);

        System.out.println("No of digits in number is "+ numberString.length());

        int count = 0;
        while(number > 0){
            count++;
            number/=10;
        }
        System.out.println("No of digits in number is "+ count);
    }
}
