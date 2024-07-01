package com.abdoa.javainterview.generic;

import java.util.Arrays;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] numArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(numArray, 11));
        System.out.println(Arrays.binarySearch(numArray, 11));
    }

    private static int binarySearch(int[] numArray, int numberToFind) {
        int start = 0;
        int end = numArray.length -1;
        while(start <= end){
            int middle = (end +start)/2;
            if(numArray[middle] == numberToFind){
                return middle;
            }
            if(numArray[middle] < numberToFind){
                start = middle+1;
            }else {
                end = middle-1;
            }
        }
        return -1;
    }
}
