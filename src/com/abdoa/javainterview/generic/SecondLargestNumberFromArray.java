package com.abdoa.javainterview.generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondLargestNumberFromArray {

    public static void main(String[] args) {
        int[] numberArray = {1, 3, 45, 76, 56, 250, 88, 99,246, 102, 249, 250, 186, 175, 246, 145, 250};
        printSecondLargestElementInArray(numberArray);
    }

    public static void printSecondLargestElementInArray(int[] array){
        if(array.length < 2){
            System.out.println("Array has less than 2 elements");
            return;
        }
        //Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Set<Integer> numberSet = new HashSet<Integer>(Arrays.stream(array).boxed().collect(Collectors.toList()));
        Integer[] integerArray = numberSet.toArray(new Integer[0]);
        Arrays.sort(integerArray);

        System.out.println(integerArray[integerArray.length-2]);
    }
}
