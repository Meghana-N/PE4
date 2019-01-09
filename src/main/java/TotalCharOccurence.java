package main.java;

public class TotalCharOccurence {
    public int countCharOccurence(String inputString, String inputChar)
    {

        int charCount = inputString.length() - inputString.replaceAll(inputChar, "").length();
        return charCount;
    }
}
