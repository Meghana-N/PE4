package main.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrOccurenceMatcher {
    public ArrayList<String> matchStr(String inputString, String wordToFind)
    {
        Pattern word = Pattern.compile(wordToFind);
        Matcher match = word.matcher(inputString);
        ArrayList<String> foundStr = new ArrayList<>();
        while (match.find()) {
            foundStr.add("Found at: "+ match.start() +" - "+ (match.end()));
        }
        return foundStr;
    }
}
