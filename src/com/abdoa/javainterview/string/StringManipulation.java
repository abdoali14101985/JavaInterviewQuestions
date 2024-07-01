package com.abdoa.javainterview.string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringManipulation {

    public static void main(String[] args) {
        String name = "Disaster name (Disaster ID 2022.01)";
        if(name.contains("Disaster ID")){
            name = name.replace("Disaster ID", "(Disaster ID :");
            name = name.concat(")");
            name = name.replace("((", "(");
            name = name.replace("))", ")");
        }

        System.out.println(name);

        String date = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        LocalDate localDate = date.isEmpty()? null : LocalDate.parse(date, formatter);
        System.out.println(localDate);

    }
}
