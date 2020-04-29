package edu.academy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StringRandom {
    List<Character> charArray = new ArrayList<>();
    private int stringSize;
    public String stringRandom (int stringSize) {
        this.stringSize = stringSize;
        // Unicode table size full 143859, 1119 - with Latin and Cyrilic;
        int unicodeTableSize = 1119, charNum;
        char[] charSymbol = new char[stringSize];
        String charString, resultString ="";
        Random random = new Random();
        for (int i = 0; i < stringSize; i++) {
            charNum = random.nextInt(unicodeTableSize);
            charString = Character.toString(charNum);
            resultString +=charString;
        }
        
        
        return resultString;
    }
}
