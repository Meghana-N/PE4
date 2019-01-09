package main.java;

public class WordCheck {
    public Boolean checkWord(String inputString)
    {
        if(inputString.contains(".*Harry.*"))
            return true;
        else
            return false;
    }
}
