package com.abdoa.javainterview.string;

//To replace particular character form given string
public class RemoveCharacter {

    public static void main(String[] args) {
        String originalString = "Abdoali";
        char characterToRemove = 'A';

        removeCharacter(originalString, characterToRemove);
    }

    private static void removeCharacter(String originalString, char characterToRemove) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < originalString.length(); i++) {
            if(Character.toLowerCase(originalString.charAt(i)) != Character.toLowerCase(characterToRemove)){
                finalString.append(originalString.charAt(i));
            }
        }
        System.out.println(finalString);
    }
}
