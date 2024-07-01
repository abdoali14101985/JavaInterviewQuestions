package com.abdoa.javainterview.java8;

import java.time.LocalDate;

public class AddDays {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 11, 18);
        System.out.println(date.plusDays(180));

    }



}
