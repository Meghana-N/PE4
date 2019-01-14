package com.stackroute.pe4;

/*Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.*/

public class WordCheck {
    public Boolean checkWord(String inputString)
    {
        if(inputString.contains(".*Harry.*")) //regular expression
            return true;
        else
            return false;
    }
}
