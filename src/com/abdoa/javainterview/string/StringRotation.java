package com.abdoa.javainterview.string;

//To find if string is rotation of given string
public class StringRotation {

    public static void main(String[] args) {
        String originalString = "ABCD";
        String rotationString = "DABCeFG";

        if(isRotation(originalString, rotationString)){
            System.out.println(rotationString +" is rotation of "+ originalString);
        } else {
            System.out.println(rotationString +" is not rotation of "+ originalString);
        }
    }

    private static boolean isRotation(String originalString, String rotationString) {
        return (rotationString.length() == originalString.length() &&
                (originalString + originalString).indexOf(rotationString) != -1 );
    }
}
