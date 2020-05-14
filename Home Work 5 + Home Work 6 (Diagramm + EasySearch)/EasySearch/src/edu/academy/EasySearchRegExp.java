package edu.academy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EasySearchRegExp implements ISearchEngine{

    @Override
    public int searchStringInText(String searchString, String text) {
        Pattern pattern = Pattern.compile(searchString.toLowerCase());
        List<String> words = Arrays.asList(text.split("[ ,.!?:;-]+|\""));
        int counter = 0;
        Matcher matcher = pattern.matcher(text);
        for (String word : words) {
           if ( pattern.matcher(word.toLowerCase()).find() == true) {
               counter++;
           };
        }
        return counter;
    }


}
