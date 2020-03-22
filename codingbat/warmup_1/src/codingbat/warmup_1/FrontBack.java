package codingbat.warmup_1;

public class FrontBack {
    public String frontBack (String str) {
        int stringLenght = str.length();
        if (stringLenght >1) {
            return String.valueOf(str.charAt(stringLenght - 1)).concat(str.substring(1, stringLenght - 1)).concat(String.valueOf(str.charAt(0)));
        } else return str;
    }
}
