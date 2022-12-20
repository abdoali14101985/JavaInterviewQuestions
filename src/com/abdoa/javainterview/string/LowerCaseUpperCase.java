package com.abdoa.javainterview.string;

// To change the 1st half of string in lowercase and 2nd half in uppercase
public class LowerCaseUpperCase {
    public static void main(String[] args) {
        String originalString = "This is Charlotte";
        StringBuilder lowerCaseString = new StringBuilder();
        StringBuilder uppercaseString = new StringBuilder();

        for (int i = 0; i < originalString.length(); i++) {
            if(i < originalString.length()/2){
                lowerCaseString.append(Character.toLowerCase(originalString.charAt(i)));
            }else {
                uppercaseString.append(Character.toUpperCase(originalString.charAt(i)));
            }
        }
        System.out.println(lowerCaseString.append(uppercaseString).toString());

    }
}
