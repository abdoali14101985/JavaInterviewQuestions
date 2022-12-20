package com.abdoa.javainterview.string;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

// To demo String joiner
public class StringJoinerDemo {

    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(",", "[", "]");
        List<String> list = Arrays.asList("abdo", "sakina","batul","amena");
        sj1.add("A").add("B").add("C");
        StringJoiner listJoiner = new StringJoiner(",");
        list.forEach(s -> listJoiner.add(s));
        System.out.println(sj1);
        System.out.println(listJoiner.toString());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add("P").add("Q");
        System.out.println(sj2);

        sj1.merge(sj2);
        System.out.println(sj1);

        Instant instant = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
        System.out.println(instant);
        System.out.println(sdf.format(Date.from(instant.plus(90, ChronoUnit.DAYS))));
        System.out.println(LocalDate.ofInstant(instant, ZoneId.systemDefault()).format(formatter).toString().toUpperCase());

        String stringDate ="2022-03-12";
        java.sql.Date sqlDate = java.sql.Date.valueOf(stringDate);
        System.out.println(sqlDate);




    }
}
