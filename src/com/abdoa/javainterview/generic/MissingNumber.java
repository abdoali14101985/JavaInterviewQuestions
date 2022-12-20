package com.abdoa.javainterview.generic;

// To find missing number from sorted integer array of natural numbers
public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13};
        int n = arr[arr.length-1];
        int sumOfNNumbers = n * (n+1)/2;
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray+= arr[i];
        }
        System.out.println("Missing number is " + (sumOfNNumbers-sumOfArray));
    }
}
