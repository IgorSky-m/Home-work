package edu.academy;

public class EasySearch implements ISearchEngine {

    @Override
    public int searchStringInText(String searchString, String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i + searchString.length() <= text.length()
                    && searchString.toLowerCase().indexOf(text.substring(i, i + searchString.length()).toLowerCase()) == 0) {
                if (searchString.length() == text.length()) {
                    counter++;
                    continue;
                } else if ( searchString.length() < (text.substring(0,text.length() - i)).length() && i != 0
                            && EChars.itsChar(text.charAt(i-1)) == true
                            && EChars.itsChar(text.charAt(i+searchString.length())) == true) {
                    counter++;
                    continue;
                } else if (i == 0 && searchString.length() < (text.substring(0,text.length() - i)).length()
                            && EChars.itsChar(text.charAt(i+searchString.length())) == true) {
                    counter++;
                    continue;
                }  else if ( searchString.length() == (text.substring(0,text.length() - i)).length() && i != 0
                        && EChars.itsChar(text.charAt(i-1)) == true ) {
                    counter++;
                    continue;
                }

            }


        }
        return counter;
    }


}
