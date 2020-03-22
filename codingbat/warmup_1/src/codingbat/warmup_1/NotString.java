package codingbat.warmup_1;

public class NotString {
    public String notString (String str, String searchWord) {
        String[] stringArray = str.split(" ");
        String firstWord = String.valueOf(stringArray[0]);
        if (firstWord.equals(searchWord)) {
            return str ;
        } else return String.join(" ",searchWord,str);


    }
}
