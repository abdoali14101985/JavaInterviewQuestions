package com.abdoa.javainterview.generic;

import java.util.Arrays;

// To reorder integer array with even numbers first followed by odd numbers
public class ReorderArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reorderEvenOddArray(arr);


    }

    public static void reorderEvenOddArray(int[] arr){
        int[] reorderedArray = new int[arr.length];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0){
                reorderedArray[index]= arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 !=0){
                reorderedArray[index]= arr[i];
                index++;
            }
        }
       Arrays.stream(reorderedArray).forEach(System.out::println);
    }
}
