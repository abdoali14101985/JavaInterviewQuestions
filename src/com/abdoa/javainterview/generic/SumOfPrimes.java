package com.abdoa.javainterview.generic;

import java.util.HashMap;
import java.util.Map;

public class SumOfPrimes {

    public static void main(String[] args) {
        Map<Long, Long> sumOfPrimes = new HashMap<>();
        long sum =0;
        for(long i =1; i<=100000; i++){
            if(isPrime(i)){
                sum+=i;
            }
            sumOfPrimes.put(i,sum);
        }
        System.out.println(sumOfPrimes);

    }

    public static boolean isPrime(long n) {
        if(n==1) {
            return false;
        }else if(n==2) {
            return true;
        }else if(n>2 && n%2==0) {
            return false;
        }else {
            long sqrt=(long) Math.sqrt((double)n);
            boolean flag=true;
            for(long i=3;i<=sqrt;i++) {
                if(n%i==0) {
                    flag=false;
                    break;
                }
            }
            return flag;
        }
    }


}
