package com.stackroute.pe4;

/*Write a program to replace all d with f and all l with t in the given String*/

public class ReplaceOccurence {
    public String replaceStringOccurence(String inputString)
    {
        String replacedString = inputString.replace('d', 'f'); //replace d with f
        String outputString = replacedString.replace('l', 't');//replace l with t
        return outputString;
    }
}
