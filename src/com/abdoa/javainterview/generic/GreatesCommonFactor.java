package com.abdoa.javainterview.generic;

public class GreatesCommonFactor {

    public static void main(String[] args) {
        int a = 10, b = 15;
        int gcd = greatestCommonFactor(a, b);
        System.out.println(gcd);
    }

    private static int greatestCommonFactor(int a, int b) {
        return b==0 ? a : greatestCommonFactor(b, a % b);
    }
}
