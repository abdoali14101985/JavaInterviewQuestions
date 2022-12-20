package com.abdoa.javainterview.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String name = "IAN Hurricane (Disaster ID :        2022.11)";
        String subStringFema="";
        String subStringName="";
        if(name.contains("Disaster ID :")){
            subStringFema = name.substring(name.indexOf("Disaster ID :")+"Disaster ID :".length(), name.length()-1).trim();
            subStringName = name.substring(0,name.indexOf('(')).trim();
        }
        System.out.println(subStringFema);
        System.out.println(subStringName);
        Pattern pattern = Pattern.compile("\\d{4,8}\\.\\d{1,2}");
        Matcher matcher = pattern.matcher(subStringFema);
        System.out.println(matcher.matches());
    }
}
