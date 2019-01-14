package com.stackroute.pe4;

/*Write a program to transpose the given string.
 Input String : a quick brown fox jumps over the lazy dog
 Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god*/

public class StringTranspose {
    public String transposeString(String string)
    {
        String[] words = string.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) //loop to reverse the words in a string
            {
                reverseWord = reverseWord + word.charAt(j); // append it to a string variable
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString.trim(); //remove spaces at the end of the string
    }
}
