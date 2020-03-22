package codingbat.warmup_1;

public class StringE {
    public boolean stringE (String str) {
        String searchSymbol = "e";
        int symbolQuality = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (searchSymbol.equals(String.valueOf(str.charAt(i)))) {
                symbolQuality ++;
            }
        }
        return symbolQuality >= 1 && symbolQuality <= 3 ? true : false;
    }
}
