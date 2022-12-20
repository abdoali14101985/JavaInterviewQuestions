package com.abdoa.javainterview.generic;

import java.util.Arrays;

// To compare 2 integer arrays are equal or not
public class CompareArrays {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {2,1,3,4,5};
        if(arraysAreEqual(array1,array2)){
            System.out.println("Two arrays are equal");
        }else {
            System.out.println("Two arrays are not equal");
        }
    }

    private static boolean arraysAreEqual(int[] array1, int[] array2) {
        if(array1.length != array2.length){
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
