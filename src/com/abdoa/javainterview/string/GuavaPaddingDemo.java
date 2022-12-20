package com.abdoa.javainterview.string;

import com.google.common.base.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GuavaPaddingDemo {

    public static void main(String[] args) {

        List<String> numberList = Arrays.asList("123","1234","12345");
        List<String> paddedNumberList = numberList.stream().
                map(s -> Strings.padStart(s,5,'0')).collect(Collectors.toList());
        paddedNumberList.forEach(System.out::println);
    }
}
