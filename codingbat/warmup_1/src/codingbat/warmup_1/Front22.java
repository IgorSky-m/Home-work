package codingbat.warmup_1;

public class Front22 {
    public String front22 (String str, int numberSymbols) {
        String stringForApp ="";
        for (int i = 0; i < (str.length() <= numberSymbols ? str.length() : numberSymbols) ; i++) {
            stringForApp = stringForApp.concat(String.valueOf(str.charAt(i)));
        }

        return stringForApp.concat(str.concat(stringForApp));
    }
}
