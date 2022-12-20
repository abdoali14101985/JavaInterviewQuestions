package com.abdoa.javainterview.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "aaabbbbbcdddddeffffg";
        printFirstNonRepeatingString(str);
    }

    private static void printFirstNonRepeatingString(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(charCountMap.containsKey(str.charAt(i))){
                charCountMap.put(str.charAt(i), charCountMap.get(str.charAt(i))+1);
            }else {
                charCountMap.put(str.charAt(i), 1);
            }
        }
        for (int i =0; i<str.length(); i++){
            if(charCountMap.get(str.charAt(i))==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
