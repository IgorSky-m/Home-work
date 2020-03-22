package codingbat.warmup_1;

public class EveryNth {
    public String everyNth (String str, int outputCharSeq) {
        String outputString ="";
        for (int i = 0; i <str.length() ; i++) {
            if (i % outputCharSeq == 0) {
                outputString = outputString.concat(String.valueOf(str.charAt(i))); //короткий вариант записи: outputString +=String.valueOf(str.charAt(i)); Но я лишний раз concat попрактиковал))
            }
        }
        return outputString;
    }
}
