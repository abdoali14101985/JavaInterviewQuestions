package com.abdoa.javainterview.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// To find product of array elements except self
public class ProductOfArray {

    public static void main(String[] args) {

        int[] inputArray = {2,3,4,5};
        Integer[] result = getProductOfArrayExceptSelf(inputArray);
        List<Integer> list = convertArrayToList(result);
        Arrays.stream(result).forEach(System.out::println);
        System.out.println(list);

    }

    private static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    private static Integer[] getProductOfArrayExceptSelf(int[] inputArray) {
        Integer[] result = new Integer[inputArray.length];
        int[] leftPrefixProduct = new int[inputArray.length];
        int[] rightPrefixProduct = new int[inputArray.length];
        int leftProduct = 1;
        int rightProduct = 1;
        //check for empty array
        if(inputArray.length<1){
            return result;
        }
        // filling leftPrefixProduct array
        for(int i=0;i<inputArray.length;i++){
            if(i==0){
                leftPrefixProduct[i] = leftProduct;
            } else {
                leftProduct = leftProduct * inputArray[i-1];
                leftPrefixProduct[i] = leftProduct;
            }
        }
        // filling rightPrefixProduct array
        for(int i=inputArray.length-1;i>=0;i--){
            if(i==inputArray.length-1){
                rightPrefixProduct[i] = rightProduct;
            } else {
                rightProduct = rightProduct * inputArray[i+1];
                rightPrefixProduct[i] = rightProduct;
            }
        }
        //filling result array
        for(int i=0; i< result.length;i++){
            result[i] = leftPrefixProduct[i] * rightPrefixProduct[i];
        }
         return result;
    }
}
