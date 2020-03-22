package codingbat.warmup_1;

public class BackAround {

    public String backAround(String str) {
        int stringLenght = str.length();
        String lastSymbol = String.valueOf(str.charAt(stringLenght - 1));
        return lastSymbol.concat(str.concat(lastSymbol));
    }
}