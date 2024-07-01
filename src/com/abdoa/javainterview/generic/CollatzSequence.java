package com.abdoa.javainterview.generic;

import java.util.*;

public class CollatzSequence {

    public static void main(String[] args) {
        Map<Long, Long> collatzSequences = new LinkedHashMap<>();
        int intg = Integer.MAX_VALUE;
        System.out.println(intg);
        for(long i=1; i<=10; i++){
            long sequenceLength = getCollatzSequence(i);
            collatzSequences.put(i, sequenceLength);
        }
        System.out.println(collatzSequences);
    }

    private static long getCollatzSequence(long i) {
        long counter = 0;
        if(i==1){
            counter = 3;
        }else {
            while(i>1){
                counter+=2;
                i = ((3*i)+1)/2;

            }
        }
        return counter;
    }
}
