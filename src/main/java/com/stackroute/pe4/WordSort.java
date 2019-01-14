package com.stackroute.pe4;

/*Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/

import java.util.ArrayList;
import java.util.Collections;

public class WordSort {
    public ArrayList<String> sortWords(String inputString) //method to sort the words in a string
    {
        String[] wordsArray = inputString.split(" "); //split string based on white space
        ArrayList<String> wordsList = new ArrayList<>();
        for(int i=0;i<wordsArray.length;i++)
        {
            wordsList.add(wordsArray[i]);
        }
        Collections.sort(wordsList); //sorts the Array list
        return wordsList;
    }
}
