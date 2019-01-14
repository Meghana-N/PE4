package com.stackroute.pe4;

/*Write a java program to count the total number of occurrences of a given character in a string without using any loop*/

public class TotalCharacterOccurence {
    public int countCharacterOccurence(String inputString, String inputChar)//method to calculate character frequency
    {
        //character count is equal to total length of the string minus remaining characters count
        int characterCount = inputString.length() - inputString.replaceAll(inputChar, "").length();
        return characterCount;
    }
}
