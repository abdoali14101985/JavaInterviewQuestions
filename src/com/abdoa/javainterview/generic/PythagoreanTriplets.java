package com.abdoa.javainterview.generic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PythagoreanTriplets {

    public static void main(String[] args) {
        long answer = -1;
        Map<Long, Long> sumProduct = new LinkedHashMap<>();
        int b, c;
        int n= 3000;
        for(int a = 1; a < n/3; a++){
            b = ((n*n) - (2*n*a))/ ((2*n) - (2*a));
            c = n-a-b;
            if((a*a)+(b*b) == (c*c)){
                System.out.println(a+" "+ b +" "+ c);
                System.out.println(a*b*c);
            }

        }
    }
}
