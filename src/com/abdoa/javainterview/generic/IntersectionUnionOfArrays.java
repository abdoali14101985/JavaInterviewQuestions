package com.abdoa.javainterview.generic;

import java.util.HashSet;
import java.util.Set;

// To find intersection of 2 arrays
public class IntersectionUnionOfArrays {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {50, 60, 70, 80, 90};

        printIntersectionOfArrays(array1,array2);

        printUnionOfArrays(array1, array2);
    }

    private static void printUnionOfArrays(int[] array1, int[] array2) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            s.add(array1[i]);
        }
        System.out.println("Union of Arrays");
        for (int i = 0; i < array2.length; i++) {
            s.add(array2[i]);
        }
        System.out.println(s);
    }

    private static void printIntersectionOfArrays(int[] array1, int[] array2){
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            s.add(array1[i]);
        }
        System.out.println("Intersection of Arrays");
        for (int i = 0; i < array2.length; i++) {
            if(s.contains(array2[i]))
                System.out.print(array2[i]+" ");

        }
        System.out.println("");
    }
}
