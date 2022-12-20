package com.abdoa.javainterview.generic;

public class LCMOfArray_Recursive {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        System.out.println(lcmOfArray(array, 0));
    }

    private static long lcmOfArray(int[] array, int index) {
        if(index == array.length-1){
            return array[index];
        }
        long a = array[index];
        long b = lcmOfArray(array, index+1);
        return (a*b) / gcd(a,b);

    }

    private static long gcd(long a, long b) {
        return b==0? a : gcd(b, a%b);
    }


}
