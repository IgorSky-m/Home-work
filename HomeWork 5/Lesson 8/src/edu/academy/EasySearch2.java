package edu.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasySearch2  implements ISearchEngine{

    @Override
    public int searchStringInText(String searchString, String text) {
        searchString = searchString.toLowerCase();
        text = text.toLowerCase();
        List<String> wordsArray;
        int counter=0;
        wordsArray = Arrays.asList(text.split("[ ,.!?:;-]+|\""));
        for (int i = 0; i <wordsArray.size() ; i++) {
            if (wordsArray.get(i).equals(searchString)) {
                counter ++;
            }
        }


        return counter;
    }
}
