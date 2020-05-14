package edu.academy;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EasySearchStream implements ISearchEngine{

    @Override
    public int searchStringInText(String searchString, String text) {
          List<String> words = Arrays.asList(text.split("[ ,.!?:;-]+|\""));
        return (int) words.stream().filter((word) -> word.toLowerCase().indexOf(searchString.toLowerCase()) > -1).count();
    }


}
