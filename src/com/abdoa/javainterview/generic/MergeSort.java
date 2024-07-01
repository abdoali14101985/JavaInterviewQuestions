package com.abdoa.javainterview.generic;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(1000);
        }
        System.out.println("Before:");
        printArray(numbers);
        mergeSort(numbers);

        System.out.println("Before:");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray) {
        int length = inputArray.length;
        if(length < 2){
            return;
        }
        int midLength = length/2;
        int[] leftArray = new int[midLength];
        int[] rightArray = new int[length - midLength];
        //populating leftArray
        for (int i = 0; i < midLength; i++) {
            leftArray[i] = inputArray[i];
        }
        //populating right array
        for (int i = midLength; i < length ; i++) {
            rightArray[i-midLength] = inputArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        // merging both array
        merge(inputArray, leftArray, rightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i=0, j=0, k=0;
        while(i< leftSize && j< rightSize){
            if(leftArray[i] <= rightArray[j]){
                inputArray[k] = leftArray[i];
                i++;
            }else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i< leftSize){
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while(j< rightSize){
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
