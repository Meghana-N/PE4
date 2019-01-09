package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class WordsSort {
    public ArrayList<String> sortWords(String inputString)
    {
        String[] wordsArray = inputString.split(" ");
        ArrayList<String> wordsList = new ArrayList<>();
        for(int i=0;i<wordsArray.length;i++)
        {
            wordsList.add(wordsArray[i]);
        }
        Collections.sort(wordsList);
        return wordsList;
    }
}
