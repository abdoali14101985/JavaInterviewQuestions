package com.abdoa.javainterview.string;
// to find special characters in string
public class SpecialCharacters {

    public static void main(String[] args) {
        String str = "abdcheury@#$$%^&*1 23  456";
        int count = 0;
        StringBuilder noSpecialChar = new StringBuilder();

        for(int i=0; i< str.length(); i++){
            if(!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))){
                count++;
            } else {
                noSpecialChar.append(str.charAt(i));
            }
        }
        if(count==0){
            System.out.println("There are no special character in string");
        } else {
            System.out.println("Special characters found "+ count );
        }
        System.out.println("String with no special characters : "+ noSpecialChar);
    }
}
