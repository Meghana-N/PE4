package com.stackroute.pe4;

/*Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.*/

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOccurenceMatcher {
    public ArrayList<String> matchString(String inputString, String wordToFind)
    {
        Pattern word = Pattern.compile(wordToFind); //find the given pattern
        Matcher match = word.matcher(inputString); //match the given pattern
        ArrayList<String> foundString = new ArrayList<>();
        while (match.find()) {
            foundString.add("Found at: "+ match.start() +" - "+ (match.end()));//position of the found string is added to array list
        }
        return foundString;
    }
}
