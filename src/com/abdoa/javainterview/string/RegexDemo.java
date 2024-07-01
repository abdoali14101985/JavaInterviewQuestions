package com.abdoa.javainterview.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String name = "IAN Hurricane (Disaster ID : 2022.11)";
        name = name.trim();
        String subStringFema="";
        String subStringName="";
        /*if(name.contains("Disaster ID :")){
            subStringFema = name.substring(name.indexOf("Disaster ID :")+"Disaster ID :".length(), name.length()-1).trim();
            subStringName = name.substring(0,name.indexOf('(')).trim();
        }*/
        System.out.println(subStringFema);
        System.out.println(subStringName);
        Pattern disasterNamePattern = Pattern.compile("^(?![(]).*"); // Regex to check if string does not start with '(';
        Pattern startWithAlphabetsPattern = Pattern.compile(("^[A-Za-z].*")); //Regex to check if string start with alphabe
        Pattern femaPattern = Pattern.compile("(Disaster ID :\\s*\\d{4,8}\\.\\d{1,2})");
        Pattern pattern = Pattern.compile("\\d{4,8}\\.\\d{1,2}");
        Matcher matcher = pattern.matcher(subStringFema);
        Matcher femaMatcher = femaPattern.matcher(name);
        Matcher disasterNameMatcher = disasterNamePattern.matcher(name);
        Matcher startWithAphabetMatcher = startWithAlphabetsPattern.matcher(name);
        System.out.println(disasterNameMatcher.matches());
        System.out.println(startWithAphabetMatcher.matches());
        System.out.println(femaMatcher.find(0));
        //System.out.println(matcher.matches());
        System.out.println("---------------------");
        System.out.println(disasterNameMatcher.matches() && femaMatcher.find(0));
    }
}
