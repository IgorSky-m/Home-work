package codingbat.warmup_1;

public class MissingChar {
    public String test (String missingChar, int index) {
        int stringLenght = missingChar.length();
        return missingChar.substring(0,index).concat(missingChar.substring(index+1, stringLenght));
    }
}
